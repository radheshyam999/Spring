package io.ExampleFive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.ExampleFive.operator.Operator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Operator operator =  context.getBean("operator",Operator.class);
        operator.getService().serviceActivate();
        
    }
}
