package ioc.profile;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
public class DataSourceForDev extends DataSource{

    public DataSourceForDev() {
        this.setUrl("jdbc:mysql://127.0.0.1:3306/dev");
        this.setUsername("root");
        this.setPassword("123");
    }
}
