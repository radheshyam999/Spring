/**
 * 
 */
package io;

/**
 * @author Radhey
 *
 */
public class Student {
	String name;
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	Student(){}
	Student(String name){
		this.name = name;
	}
	Student(String name,int id){
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void show() {
		System.out.println("name of student"+ this.name + "id of student :" + id);
	}
	
}
