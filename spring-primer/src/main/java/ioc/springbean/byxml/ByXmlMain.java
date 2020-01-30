package ioc.springbean.byxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
public class ByXmlMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = ctx.getBean(Book.class);
        System.out.println(book);

        Book book1 = (Book) ctx.getBean("book1");
        System.out.println("book1 = " + book1);

        book1 = (Book) ctx.getBean("book1", Book.class);
        System.out.println("book1 = " + book1);
    }
}
