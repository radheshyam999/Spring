package io.h;

public class CoInjection {

	
	private String doh;
	private Emp emp;
	
	CoInjection(Emp emp){
		this.emp = emp;
	}	
	public String getDoh() {
		return doh;
	}
	 
	public void setDoh(String doh) {
		this.doh = doh;
	}
	 
	public Emp getEmp() {
		return emp;
	}
	
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
}
