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
    	  ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	  CoustomerDao cdo =   (CoustomerDao) context.getBean("coustomerdao");
    	  Coustomer cust = new Coustomer(1,"robert",7778);
    	  cdo.Insert(cust);
    }
}
