/**
 *
 * @author kharileigh
 */

package com.kharileigh.carrentalsystem;


public class Honda extends Car {

	public Honda(String model, String color) {
		super(model, color);
	}
	
	@Override
	public void engine() {
		System.out.println("Honda Engine goes HOOOOM.....");
	}

}
