package ioc.springbean.byconfig;

import lombok.Data;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@Data
public class HelloRobot {

    private String name = "壹零";

    public HelloRobot() {
        System.out.println("New HelloRobot");
    }

    public String sayHello() {
        return "Hello, 我是" + name;
    }

}
