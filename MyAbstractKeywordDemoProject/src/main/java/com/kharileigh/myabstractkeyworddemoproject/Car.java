/**
 *
 * @author kharileigh
 * <------- BASE / PARENT CLASS ------->
 * abstract : contract with child class to implement abstract method
 * 1. can't have no body
 * 2. if a class contains even a single abstract method then it is MANDATORY FOR US TO MARK THAT CLASS ABSTRACT
 * Can't instantiate (create object of abstract class)
 */

package com.kharileigh.myabstractkeyworddemoproject;

//------ CLASS NOW LABELLED ABSTRACT AS IT HAS AN ABSTRACT METHOD
abstract public class Car {
    
    private String model, color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

        //--------- ABTRACT METHOD HAS NO BODY 
        abstract public void engine();
        
        
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
