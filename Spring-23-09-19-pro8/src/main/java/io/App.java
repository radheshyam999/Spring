package io;

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
       
    	 
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        Emp e1 = (Emp) context.getBean("emp");
    	e1.show();
    	System.out.println( "Hello World!" );
    }
}
