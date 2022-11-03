/**
 *
 * @author kharileigh
 * <------- CHILD CLASS EXTENDING BASE CLASS ----->
 */

package com.kharileigh.myabstractkeyworddemoproject;


public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}

        //----- METHOD 
        public void bmwEngine() {
            System.out.println("BMW Engine goes HOOOOM.....");
        }
        
        //----- ABSTRACT METHOD IMPLEMENTED
	@Override
	public void engine() {
            bmwEngine();
	}

}
