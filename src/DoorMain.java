import com.intuit.Company;
import com.intuit.Door;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DoorMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        Door door = context.getBean("door2", Door.class);

        door.open();
        door.close();
        Company company = context.getBean("company", Company.class);
        System.out.println("Headquarters are in  "+company.getHq());
        System.out.println("Size is in  "+company.getSize());
    }
}
