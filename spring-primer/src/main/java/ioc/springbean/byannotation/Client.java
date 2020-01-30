package ioc.springbean.byannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */

/**
 * 默认生命周期为singleton
 */
@Scope("prototype")
/**
 * 默认情况下，Bean 的名字是类名首字母小写。
 * 例如下面的 Client，它的实例名，默认就是 client。如果开发者想要自定义名字，就直接在 @Component 注解中添加即可。
 */
@Component
public class Client {

    public void sendRequest() {
        System.out.println(this + " send request ...");
    }
}
