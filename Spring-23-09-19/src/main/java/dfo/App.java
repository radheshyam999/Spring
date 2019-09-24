package dfo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class App {
    public static void main( String[] args )
    {
     /** @SuppressWarnings("deprecation")
	  BeanFactory bf = new XmlBeanFactory(new FileSystemResource("F:\\Javaee\\Spring\\Spring-23-09-19\\src\\main\\java\\spring.xml"));
       lt=  bf.getBean("CI");*/
    	ApplicationContext  context =new ClassPathXmlApplicationContext("F:\\Javaee\\Spring\\Spring-23-09-19\\src\\main\\java\\spring.xml"); 
       Emp emp1 = (Emp) context.getBean("emp");     
    	emp1.show();
   
    }
}