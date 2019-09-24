package haver;


import org.springframework.context.annotation.*;

@Configuration
public class EmpConfig {

  @Bean
  Emp emp() {
	  return new Emp();
  }
	
	
}
