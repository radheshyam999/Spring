package io;
import javax.annotation.*;
public class Emp {
 private Salary salary;
@Resource(name="salary")
public Salary getSalary() {
	return salary;
}

public void setSalary(Salary salary) {
	this.salary = salary;
}
   public void show() {
	 System.out.println(salary.getBasic());
	 System.out.println(salary.getDa());
	 System.out.println(salary.getTa());
	 
     }
}
