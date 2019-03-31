Netty
=====

在服务器端是在worker的Channel端设置属性，
    boot.childOption(ChannelOption.TCP_NODELAY, true);
设置这样做好的好处就是禁用nagle算法，Nagle算法试图减少TCP包的数量和结构性开销, 将多个较小的包组合成较大的包进行发送。
但这不是重点, 关键是这个算法受TCP延迟确认影响, 会导致相继两次向连接发送请求包，读数据时会有一个最多达500毫秒的延时。


SimpleChannelInboundHandler的channelRead0还有一个好处就是你不用关心释放资源，
因为源码中已经帮你释放了，所以如果你保存获取的信息的引用，是无效的。


DEFAULT_EVENT_LOOP_THREADS = Math.max(1, SystemPropertyUtil.getInt(
                "io.netty.eventLoopThreads", Runtime.getRuntime().availableProcessors() * 2));
一般是你CPU *2的个数，在Reactor模式中，mainReactor角色一般只需要一个线程就搞定了，subReactor角色就是那个苦逼的worker了，
一般boss（mainReactor）一个就够了，subReactor就是需要多个了，所以在【代码一】中：

