/**
 * 
 */
package io;

/**
 * @author Admin
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sim sim = new Vodefone();
		sim.call();
		sim.data();
		sim = new Airtel();
		sim.call();
		sim.data();
		System.out.println("hello world");

	}

}
