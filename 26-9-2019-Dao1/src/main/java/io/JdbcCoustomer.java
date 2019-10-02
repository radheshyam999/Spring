package io;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCoustomer extends JdbcDaoSupport  implements CoustomerDao {

	@Override
	public void Insert(Coustomer cust) {
		
		String sql = "INSERT INTO cust "+"(id,name,age)VALUES(?,?,?)";
		getJdbcTemplate().update(sql,new Object[] {cust.getId(),cust.getName(),cust.getAge()});
		
	
	}	
	
}
