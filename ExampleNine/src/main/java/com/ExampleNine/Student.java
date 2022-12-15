/**
 * 
 */
package com.ExampleNine;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Admin
 *
 */
public class Student {
	Student(){}
	String name;
	String interstedCourse;
	String hobby;
	
	public String getName() {
		return name;
	}
	@Value("Radhey")
	public void setName(String name) {
		this.name = name;
	}
	public String getInterstedCourse() {
		return interstedCourse;
	}
	@Value("interstedCourse")
	public void setInterstedCourse(String interstedCourse) {
		this.interstedCourse = interstedCourse;
	}
	public String getHobby() {
		return hobby;
	}
	@Value("Singing")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Student(String name, String interstedCourse, String hobby) {
		this.name = name;
		this.interstedCourse = interstedCourse;
		this.hobby = hobby;
	}
	
	public void show() {
		System.out.println("name :" + name);
		System.out.println("interstedCourse" + interstedCourse);
		System.out.println("hobby " + hobby);
	}

}
