package io;

public class Main {

	
	
	
	public static void main(String... s) {
		A b =  new B();//this is upcatiing
		b.letLearn();
		B a = (B)b;// Down casting 
		a.show();
		b= a;
		((B) b).show();
	  }
}
