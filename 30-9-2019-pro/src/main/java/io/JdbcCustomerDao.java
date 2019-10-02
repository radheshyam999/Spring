package io;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDao extends JdbcDaoSupport  implements CustomerDao {

	@Override
	public void insert(Customer cus) {
		  String sql ="INSERT INTO cust"+"VALUES(?, ?,?)";
         getJdbcTemplate().update(sql,new Object[] {cus.getId(),cus.getName(),cus.getAge()});		  

	}

	@Override
	public void insertNamedParmeter(Customer cus) {
		// TODO Auto-generated method stub
 /**
  * not supported
  * 
  * */
	}

	@Override
	public void insertBatch(List<Customer> cus) {
		  String sql ="INSERT INTO cust"+"VALUES(?, ?,?)";
		  getJdbcTemplate().update(sql,new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Customer listcust = cus.get(i);
			ps.setInt(1, listcust.getId());
			ps.setString(2, listcust.getName());
			ps.setInt(3, listcust.getAge());
			
			}

			@Override
			public int getBatchSize() {
				
				
			return 0;
			}});

	}

	@Override
	public void insertNamedParmeter(List<Customer> cus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertNamedParmeter2(List<Customer> cus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertBatchSql(String sql) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public Customer findBycustId(int id) {
		String sql ="select *from cust where id=?";
		Customer custom =	(Customer) getJdbcTemplate().queryForObject(sql, new Object[] {id},new CustomerRowMapper());
		return custom;
	}

	@Override
	public Customer findBycustId2(int id) {
		// TODO Auto-generated method stub
		String sql ="select *from cust where id=?";
		Customer custom =	(Customer) getJdbcTemplate().queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper(Customer.class));
		return custom;
		
	}

	@Override
	public List<Customer> findAll() {
		String sql ="select *from cust ";
		List<Customer> cust = new ArrayList<>();
		List<Map<String,Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map row:rows) {
			
		}
 		
		
		
		
		return null;
	}

	@Override
	public List<Customer> findAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findCustNameBycustId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findTotal() {
		// TODO Auto-generated method stub
		
		String sql = "select count(*) from cust";
		  int Total = getJdbcTemplate().queryForInt(sql);
		return Total;
	}

}
