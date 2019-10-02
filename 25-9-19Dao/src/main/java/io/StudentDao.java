package io;

import java.util.List;

public interface StudentDao {
	public List<Student>getAllStudent();
    public Student	getstudent(int roll);
    public void upadteStudent(Student student);
    public void deleteStudent(Student student);
}

