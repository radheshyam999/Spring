package kill;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
       Emp e1 = (Emp) context.getBean("emp");
       e1.setName("askdjskdlfjsdlk");
       System.out.println(e1.getName());
       context.registerShutdownHook();
    
    
    
    }
}
