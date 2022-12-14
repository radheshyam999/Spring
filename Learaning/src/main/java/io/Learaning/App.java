package io.Learaning;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.Learaning.service.Airtel;
import io.Learaning.service.Sim;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		System.out.println(Files.exists(Paths.get("beans.xml")));	
    		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    		Sim sim = context.getBean("vodefone",Sim.class);
    		sim.call();
    		sim.data();
    	}catch(Exception io) {
    		io.printStackTrace();
    	}
    	
    	System.out.println( "Hello World!" );
        Sim sim = new Airtel();
        sim.call();
        sim.data();
        
        
    }
}
