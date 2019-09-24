package io;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmpConfig {
 @Bean(initMethod="init",destroyMethod="destory")
 @Scope("prototype")
 public Emp emp() {
	return new Emp();
	 
 }
	
}
