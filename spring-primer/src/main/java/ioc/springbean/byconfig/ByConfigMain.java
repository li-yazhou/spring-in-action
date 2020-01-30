package ioc.springbean.byconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
public class ByConfigMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

        HelloRobot helloRobot = ctx.getBean(HelloRobot.class);

        String content = helloRobot.sayHello();
        System.out.println("content = " + content);
    }
}
