package io;

import java.util.ArrayList;
import java.util.List;

public class Daoimpl implements StudentDao {
    List<Student>students;
    Daoimpl(){
    students = new ArrayList<Student>();
    Student student1 = new Student("Radheshyam", 500, 600);
    Student student2 = new Student("robert", 5000000, 60564656);
    Student student3 = new Student("Hish", 50045464, 60015);
    students.add(student1);
    students.add(student2);
    students.add(student3);
    }
    @Override
	public List<Student> getAllStudent() {
		return students;
	}

	@Override
	public Student getstudent(int roll) {
		return students.get(roll);
	}

	@Override
	public void upadteStudent(Student student) {
		students.get(student.getRoll()).setName(student.getName());
		System.out.println("Name:"+student.getName()+"\n Roll:"+student);
           
	   }

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRoll());		
        System.out.println("ROll no"+student.getRoll()+"\n Name"+student.getName());
	 }

}
