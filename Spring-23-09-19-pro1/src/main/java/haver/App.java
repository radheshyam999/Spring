package haver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("F:\\Javaee\\Spring\\Spring-23-09-19-pro1\\src\\main\\java\\Spring.xml");
       Emp e1 = (Emp) context.getBean("emp");
       e1.show();
       
    }
}
