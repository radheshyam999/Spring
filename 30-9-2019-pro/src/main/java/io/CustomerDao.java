package io;

import java.util.List;

public interface CustomerDao {
		public void insert(Customer cus);
		public void insertNamedParmeter(Customer cus);
		public void insertBatch(List<Customer> cus);
		public void insertNamedParmeter(List<Customer> cus);
		public void insertNamedParmeter2(List<Customer> cus);
		public void insertBatchSql(String sql);
		public Customer findBycustId(int id);
		public Customer findBycustId2(int id);
        public List<Customer> findAll();
        public List<Customer> findAll2();
        public String findCustNameBycustId(int id);
        public int findTotal();
}
