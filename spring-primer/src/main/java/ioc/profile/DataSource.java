package ioc.profile;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@Data
public class DataSource {

    private String url;
    private String username;
    private String password;

}
