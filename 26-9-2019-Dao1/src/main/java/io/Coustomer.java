package io;

import java.io.Serializable;


public class Coustomer implements Serializable  {

	private String name;
	private int age;
	private int id;
	public Coustomer(int id, String name, int age) {
		this.age =age;
		this.id=id;
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	

}
