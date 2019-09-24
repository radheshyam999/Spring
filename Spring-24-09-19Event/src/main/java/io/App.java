package io;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext con =new ClassPathXmlApplicationContext("bean.xml");
        con.start(); 
        Message mes = (Message) con.getBean("message");
        mes.getMessage();
        con.stop();
    
    }
}
