/**
 *
 * @author kharileigh
 * <------ BASE CLASS ----->
 */

package com.kharileigh.vehicle;

import java.util.Scanner;


public class Road {
    
    public static void main(String[] args) {
        
        // initialise Scanner
        Scanner sc = new Scanner(System.in);
        
        //----- USER INPUTS FIRST CAR
        System.out.println("Please enter your Car details.");
        System.out.print("Model : ");
        String model = sc.nextLine();
        
        System.out.print("\n Color : ");
        String color = sc.nextLine();
        
        System.out.print("\n Price : ");
        String priceInput = sc.nextLine();
        int price = Integer.parseInt(priceInput);
        
        System.out.print("\n Type of Gas : ");
        String gas = sc.nextLine();
        
        System.out.print("\n Number of Doors : ");
        String doorsInput = sc.nextLine();
        int numOfDoors = Integer.parseInt(doorsInput);
        
        
        //----- CREATE NEW CAR OBJECT WITH ALL DETAILS
        Car newCar = new Car();
        
        //------ PRINT FULL SPECIFICATIONS TO USER
        System.out.println("\n ======= FULL CAR SPECIFICATIONS ======\n");
        System.out.println("\n Model : " + newCar.getModel());
        System.out.println("\n Color : " + newCar.getColor());
        System.out.println("\n Price : " + newCar.getPrice());
        System.out.println("\n Type of Gas : " + newCar.getGas());
        System.out.println("\n Number of Doors : " + newCar.getNumOfDoors());
    }
    
}
