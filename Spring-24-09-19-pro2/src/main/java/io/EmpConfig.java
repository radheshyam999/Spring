package io;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

	@Bean Emp Emp() {
		
		
		return new Emp(salary());
	}
	@Bean
	Salary salary() {
		
		return salary();
	}
	
}
