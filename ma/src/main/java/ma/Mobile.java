package ma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mobile {

	public static void main(String[] args) {
		
	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("hello world");
		//Sim  sim  = context.getBean("sim", Sim.class);
		

	}

}
