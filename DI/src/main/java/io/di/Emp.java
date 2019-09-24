package io.di;

public class Emp {
private String name;
private Salary sal;

public void setSal(Salary sal) {
	System.out.println("i am set Salry obj"+ sal);
	this.sal=sal;
}

public void seName(String name) {
System.out.println("i am set name"+name);
	this.name=name;
}


public void show() {
	sal.getBasic();
	sal.getDa();
	sal.getTa();
	
	
}
}
