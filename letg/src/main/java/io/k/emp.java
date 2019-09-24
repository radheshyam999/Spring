package io.k;

public class emp {
private String name;

public String getName() {

	System.out.println("i am getter ");
	
	return name;
}

public void setName(String name) {
	System.out.println("i am settr ");
	this.name = name;
}
	
	public void init() {
      System.out.println("i am init");
	}
public void destroy() {
	System.out.println("i am init");
	}	
	
}
