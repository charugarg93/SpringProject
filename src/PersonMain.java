import com.annotationsDemo.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:com/annotationsDemo/traffix.xml");
        Person person =  context.getBean("person", Person.class);
        Car c = person.getCar();

        System.out.println(person.getName()+"   "+c.getCarName()+"  "+ person.getStocklist());
    }

}
