package simple.hj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
      @SuppressWarnings("deprecation")
	  BeanFactory bf = new XmlBeanFactory(new FileSystemResource("F:\\Javaee\\Spring\\hj\\src\\main\\java\\spring.xml"));
      CoInjection lt= (CoInjection) bf.getBean("CI");
      System.out.println(lt.getDa());
    }
}
