package haver;

public class Emp {
   private String name;
   private Salary salary;
   Emp(Salary salary,String name){
	   this.salary=salary;
	   this.name =name;
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
   	
	
	
	int show(){
		
		System.out.println(salary.getBasic());
		System.out.println(salary.getTa());
		System.out.println(salary.getDa());
		
		return 0;
		
	}
	
}
