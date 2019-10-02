package io;

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
       StudentJdbcTemplate studentjdbctemplate= (StudentJdbcTemplate) context.getBean("studentjdbctemplate"); 
       System.out.println("creat \n");
       studentjdbctemplate.creat(10, "radhe", 999);
       studentjdbctemplate.creat(11, "robert", 1000);
       studentjdbctemplate.creat(12, "Megh", 15888);
       System.out.println("show \n");
       List<Student>studnets = studentjdbctemplate.listStudent();
       for(Student student:studnets) {
    	   System.out.println("Name"+student.getName()+"\n");
    	   System.out.println("Name"+student.getAge()+"\n");
    	   System.out.println("Name"+student.getId()+"\n");
       }
       
       System.out.println("Upadating recording");
       studentjdbctemplate.update(10, 750);
       Student student1 = studentjdbctemplate.getStudent(10);
       System.out.println("Name"+student1.getName()+"\n");
	   System.out.println("Name"+student1.getAge()+"\n");
	   System.out.println("Name"+student1.getId()+"\n");
       
    }
}
