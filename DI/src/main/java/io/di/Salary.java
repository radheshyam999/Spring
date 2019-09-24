package io.di;

public class Salary {

	private int Ta;
	public int getTa() {
		System.out.println("i am getTa");
		return Ta;
	}
	public void setTa(int ta) {
		System.out.println("i am setTa");
		Ta = ta;
	}
	public int getDa() {
		System.out.println("i am  am GetDA");
		return Da;
	}
	public void setDa(int da) {
		System.out.println("i am getDa");
		Da = da;
	}
	public int getBasic() {
	
		System.out.println("i am getBasic");
		
		return basic;
	}
	
	public void setBasic(int basic) {
		System.out.println("i am setBasic");
		this.basic = basic;
	}
	private int Da;
	private int basic;
	Salary(){
		System.out.println("i am conctructer");
	}
	
	
	
}
