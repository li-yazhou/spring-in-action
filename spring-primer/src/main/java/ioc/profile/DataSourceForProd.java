package ioc.profile;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
public class DataSourceForProd extends DataSource {

    public DataSourceForProd() {
        this.setUrl("jdbc:mysql://192.158.222.33:3306/prod");
        this.setUsername("root");
        this.setPassword("456");
    }
}
