import com.intuit.Company;
import com.intuit.Conference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        Conference conference = context.getBean("conference", Conference.class);
//
//        ApplicationContext context2 = new FileSystemXmlApplicationContext("classpath:beans.xml");
//        Company company = context.getBean("company", Company.class);
//
        System.out.println("Before calling Conference");
        conference.schedule();
        System.out.println("After calling Conference");
    }
}
