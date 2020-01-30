package ioc.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@Configuration
public class ProfileConfig {

    @Bean("datasource")
    @Profile("dev")
    DataSource devDataSource() {
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/dev");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123");
//        return dataSource;
        return new DataSourceForDev();
    }

    @Bean("datasource")
    @Profile("prod")
    DataSource prodDataSource() {
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl("jdbc:mysql://192.158.222.33:3306/prod");
//        dataSource.setUsername("root");
//        dataSource.setPassword("456");
//        return dataSource;
        return new DataSourceForProd();
    }

}
