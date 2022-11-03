/**
 *
 * @author kharileigh
 * <------- CHILD CLASS EXTENDING BASE CLASS ----->
 */

package com.kharileigh.myabstractkeyworddemoproject;


public class Honda extends Car {

	public Honda(String model, String color) {
		super(model, color);
	}
	
	@Override
	public void engine() {
		System.out.println("Honda Engine goes HOOOOM.....");
	}

}
