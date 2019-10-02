package io;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return null;
	}

}
