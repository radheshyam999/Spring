package haver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SalaryConfig.class);
        Emp e=context.getBean(Emp.class);
        Salary salary =context.getBean(Salary.class);
        e.setName("robert");
        salary.setBasic(1200);
        System.out.println(e.getName());
        
        System.out.println(salary.getBasic());
        		
    }
}
