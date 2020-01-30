package ioc.springbean.byconfig;

import org.springframework.context.annotation.*;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@Configuration
/**
 * 混合配置就是 Java 配置+XML 配置。混用的话，可以在 Java 配置中引入 XML 配置。
 */
@ImportResource("classpath:applicationContext.xml")
public class JavaConfig {

    @Bean("helloRobot")
    @Scope("prototype")
    HelloRobot createHelloRobot() {
        return new HelloRobot();
    }

}
