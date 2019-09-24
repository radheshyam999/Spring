package kill;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Emp {
   private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   @PostConstruct
public void init(){
	System.out.println("I am init ");   
   }
@PreDestroy
public void destory() {
	System.out.println("i am destory");
}


}