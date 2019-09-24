package io.p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Jho implements BeanPostProcessor  {

	 public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		 System.out.println("i am process after Initliztion");
		 
		 return bean;
	}
	
	 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("i am process before Initliztion");
		 
		 
		 return bean;
		}
	
	
}
