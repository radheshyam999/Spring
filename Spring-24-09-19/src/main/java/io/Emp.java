package io;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private Salary salary;
    @Autowired
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
