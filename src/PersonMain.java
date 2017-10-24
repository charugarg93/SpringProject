import com.annotationsDemo.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.annotationsDemo")
public class PersonMain {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:com/annotationsDemo/traffix.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonMain.class);
        Person person =  context.getBean("person", Person.class);
        Car c = person.getCar();

        System.out.println(person.getName()+"  "+c.getCarName());
    }

}
