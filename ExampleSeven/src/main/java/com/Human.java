/**
 * 
 */
package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Admin
 *
 */
public class Human {
	@Autowired
	@Qualifier("Humanheart")
	private Heart heart;

	public Human() {
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		System.out.println("hey i am setter");
		this.heart = heart;
	}

}
