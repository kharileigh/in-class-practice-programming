/**
 *
 * @author kharileigh
 * <------ SUPERCLASS CLASS ------->
 */

package com.kharileigh.vehicle;


public class Vehicle {

    private String model, gas;
    private int price;
    
    
    //------ CONSTRUCTOR TO BE USED 
    public void vehicle(String model, int price, String gas) {
        this.model = model;
        this.price = price;
        this.gas = gas;
        
    }
    
     
    //------ METHOD DISPLAYS VEHICLE SPECIFICATIONS
    public void displayCarSpec(){
        System.out.println("Model : " + model);
        System.out.println("Type of Gas Used: " + gas);
        System.out.println("Cost : " + price);
    }

    //------- GETTERS 
    public String getModel() {
        return model;
    }

    public String getGas() {
        return gas;
    }

    public int getPrice() {
        return price;
    }
    
    
    //--------- SETTERS
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setGas(String gas) {
        this.gas = gas;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
   
    
}
