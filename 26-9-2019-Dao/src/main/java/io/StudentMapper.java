package io;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setId(rs.getInt("id"));
		return student;
	}

}
