package io;

import java.util.List;

import javax.sql.DataSource;

public interface Sdao {
	public void setDataSource(DataSource datasource);
	public void creat(Integer id,String name,Integer age);
	public Student getStudent(Integer id);
	public List<Student> listStudent();
	public void delete(Integer id);
	public void update(Integer id,Integer age);	
}
