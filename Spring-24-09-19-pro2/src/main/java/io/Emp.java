package io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	private Salary salary;
	 private String name;
	Emp(Salary salary){
		this.salary =salary;
	}
   
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
    public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	int show() {
	   salary.setBasic(1213123);
	   salary.setDa(565656);
	   salary.setTa(6465656);
	   
		System.out.println(salary.getBasic());
		System.out.println(salary.getDa());
		System.out.println(salary.getTa());
	

	
	return 0;
	}
}
