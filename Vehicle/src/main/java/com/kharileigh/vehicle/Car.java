/**
 *
 * @author kharileigh
 * <------ INHERITS FROM VEHICLE ----->
 */

package com.kharileigh.vehicle;


public class Car extends Vehicle {
    
    private String color;
    private int numOfDoors;
    
    
    //------- CONSTRUCTOR TO ADD FURTHER DETAILS TO VEHICLE SPECIFICATION
    public void carSpec(String model, String color, int price, String gas, int numOfDoors) {
        
        // call superclass method
        vehicle(model, price, gas);
        this.color = color;
        this.numOfDoors = numOfDoors;
    
    }

    
    //------ GETTERS
    public String getColor() {
        return color;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
    
    
    //------- SETTERS
    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
    
}
