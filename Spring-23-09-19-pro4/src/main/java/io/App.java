package io;

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
    	 ApplicationContext contex = new AnnotationConfigApplicationContext(EmpConfig.class);
         Emp e1 = contex.getBean(Emp.class);
          e1.setName("robert"); 
          System.out.println(e1.getName());
    
    
    
    }
}
