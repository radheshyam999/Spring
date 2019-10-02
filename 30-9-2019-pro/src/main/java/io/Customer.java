package io;

import java.io.Serializable;

public class Customer implements Serializable {
		private int id;
		private String name;
		private int age;
//		Customer(int id,String name,int age){
//			this.name = name;
//			this.age =age;
//			this.id = id;
//		}
//		
		
		public Customer(int id, String name, int age) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.age =age;
			this.id = id;
	
		
		
		}


		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
	
	
	
}
