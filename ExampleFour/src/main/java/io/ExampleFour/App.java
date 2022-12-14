package io.ExampleFour;
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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        student.mathCheat.mathCheat();
        AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
        anotherStudent.mathCheat.mathCheat();
        
    }
}
