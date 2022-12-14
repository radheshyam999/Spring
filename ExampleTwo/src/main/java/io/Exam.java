/**
 * 
 */
package io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 *
 */
public class Exam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
		Student student = application.getBean("student",Student.class);
		student.show();
			
	}

}
