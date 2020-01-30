package ioc.springbean.byannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@Scope("singleton")
@Component
public class Server {

    public void start() {
        System.out.println(this + " start ...");
    }

    public void shutdown() {
        System.out.println(this + " shutdown ...");
    }

}
