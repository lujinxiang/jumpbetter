package springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringStart.class, args);
        ApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("");
        classPathXmlApplicationContext.getBean("hello");
    }

}
