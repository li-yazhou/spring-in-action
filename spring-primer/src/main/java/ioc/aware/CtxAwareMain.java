package ioc.aware;

import com.sun.xml.internal.xsom.parser.AnnotationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@Scope("prototype")
@Component
public class CtxAwareMain {

    @Autowired
    private CtxAware ctxAware;


    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

    }

}
