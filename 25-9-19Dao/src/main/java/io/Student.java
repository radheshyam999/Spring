package io;

public class Student {

	private String name;
	private int roll;
    public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	private int age;	
    Student(String name,int roll,int age){
    	this.age=age;
    	this.name = name;
    	this.roll=roll;
    }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	
}
