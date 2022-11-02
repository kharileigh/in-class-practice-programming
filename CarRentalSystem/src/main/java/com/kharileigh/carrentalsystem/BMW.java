/**
 *
 * @author kharileigh
 */

package com.kharileigh.carrentalsystem;


public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}
	
	@Override
	public void engine() {
		System.out.println("BMW Engine goes HOOOOM.....");
	}

}
