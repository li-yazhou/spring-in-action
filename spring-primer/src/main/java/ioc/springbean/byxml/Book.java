package ioc.springbean.byxml;

import lombok.Data;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@Data
public class Book {

    private Integer id = 1_000;
    private String name = "Effective Java";
    private Double price = 100.00;

}
