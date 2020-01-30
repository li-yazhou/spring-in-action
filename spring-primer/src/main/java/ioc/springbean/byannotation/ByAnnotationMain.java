package ioc.springbean.byannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
public class ByAnnotationMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigWithAnnoScan.class);

        Client client1 = (Client) ctx.getBean("client");
        client1.sendRequest();

        Client client2 = (Client) ctx.getBean("client");
        client2.sendRequest();

        Client client3 = (Client) ctx.getBean(Client.class);
        client3.sendRequest();

        Server server = ctx.getBean(Server.class);
        server.start();
        server.shutdown();
    }
}
