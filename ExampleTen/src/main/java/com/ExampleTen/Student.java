package com.ExampleTen;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Radhey Shyam Dubey Dec 15, 2022
 *
 */
public class Student {
    	
    	@Value("${student.name}")
    	String name;
    	@Value("${student.course}")
    	String interstedCourse;
    	@Value("${student.hobby}")
	String hobby;
		Student(){}
		public String getName() {
			return name;
		}
		//@Value("${student.name}")
		public void setName(String name) {
			this.name = name;
		}
		public String getInterstedCourse() {
			return interstedCourse;
		}
		//@Value("${student.course}")
		public void setInterstedCourse(String interstedCourse) {
			this.interstedCourse = interstedCourse;
		}
		public String getHobby() {
			return hobby;
		}
		//@Value("${student.hobby}")
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
