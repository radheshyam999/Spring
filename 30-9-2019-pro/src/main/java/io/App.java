package io;

import java.util.ArrayList;
import java.util.List;

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
        CustomerDao cdo = (CustomerDao) context.getBean("customerdao");
        Customer cus1 =  new Customer(1, "radheshyam", 290);
        Customer cus2 =  new Customer(2, "radhe", 20);
        Customer cus3 =  new Customer(3, "robert", 29);
    	List<Customer> clist = new ArrayList<>();
    	clist.add(cus1);
    	clist.add(cus2);
    	clist.add(cus3);
    	cdo.insertBatch(clist);
    	
    	
    }
}
