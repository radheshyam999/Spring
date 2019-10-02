package io;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbcTemplate implements Sdao {
    private DataSource datasource;
    private JdbcTemplate jdbctemplate;
	@Override
	public void setDataSource(DataSource datasource) {
	   this.jdbctemplate =  new JdbcTemplate(datasource); 
		
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void creat(Integer id, String name, Integer age) {
		String sql ="INSERT INTO student VALUES(?,?,?)";
		jdbctemplate.update(sql,new Object[] {id,name,age});
		System.out.println("id:"+id+"\name:"+name+"\n age:"+age);
	}

	@Override
	public Student getStudent(Integer id) {
		String sql ="SELECT student WHERE id=?";
		Student studnet =(Student) jdbctemplate.queryForObject(sql, new Object[] {id},new StudentMapper()); 
		return studnet;
	}

	@Override
	public List<Student> listStudent() {
		String sql = "SELECT * FROM student";
		List<Student> student = (List<Student>) jdbctemplate.queryForObject(sql, new StudentMapper());
		return  student;
	}

	@Override
	public void delete(Integer id) {
		String sql="DELETE  student WHERE id=?";
		jdbctemplate.update(sql,id);
		System.out.println("id");

	}

	@Override
	public void update(Integer id, Integer age) {
		String sql="UPDATE  student SET AGE=? WHERE id=?";
		jdbctemplate.update(sql,id);
		 

	}

}
