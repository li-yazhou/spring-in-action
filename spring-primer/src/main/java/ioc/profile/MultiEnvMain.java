package ioc.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
public class MultiEnvMain {

    public static void main(String[] args) {

        // 加载配置类，注意，需要先设置当前环境，然后再去加载配置类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

//        ctx.getEnvironment().setActiveProfiles("dev");
//        ctx.register(ProfileConfig.class);
//        ctx.refresh();
//        DataSource dev = (DataSource) ctx.getBean("datasource");
//        System.out.println("dev = " + dev);

        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(ProfileConfig.class);
        ctx.refresh();
        DataSource prod = (DataSource) ctx.getBean("datasource");
        System.out.println("prod = " + prod);



    }
}
