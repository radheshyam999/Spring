/**
 * 
 */
package com.ExampleEight;

/**
 * @author Radhey Shyam Dubey Dec 15, 2022
 *
 */
public class Student {
		String name;
		String interstedCourse;
		String hobby;
		Student(){}
		public String getName() {
			return name;
		}
		
		public Student(String name, String interstedCourse, String hobby) {
			this.name = name;
			this.interstedCourse = interstedCourse;
			this.hobby = hobby;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getInterstedCourse() {
			return interstedCourse;
		}
		public void setInterstedCourse(String interstedCourse) {
			this.interstedCourse = interstedCourse;
		}
		public String getHobby() {
			return hobby;
		}
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		
		
		public void show() {
			System.out.println("name : " + name);
			System.out.println("interstedCourse : " + interstedCourse);
			System.out.println("hobby : " + hobby);
		}
		
		
}
