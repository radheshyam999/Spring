package io.k;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context;
    	context= new ClassPathXmlApplicationContext("F:\\Javaee\\Spring\\xml\\spring.xml");  
    	emp e = (emp) context.getBean("emp");
    	emp e1= (emp) context.getBean("emp1");    	
    
    	
    }

	public int add(int i, int j) {
		
		return i+j;
	}
}
