/**
 *
 * @author kharileigh
 * <------- CHILD CLASS EXTENDING BASE CLASS ----->
 */

package com.kharileigh.myabstractkeyworddemoproject;


public class Mercedes extends Car {

	public Mercedes(String model, String color) {
		super(model, color);
	}
	
	@Override
	public void engine() {
		System.out.println("Mercedes Engine goes HOOOOM.....");
	}

}
