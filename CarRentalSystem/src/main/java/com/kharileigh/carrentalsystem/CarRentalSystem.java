/**
 *
 * @author kharileigh
 */

package com.kharileigh.carrentalsystem;


public class CarRentalSystem {

    public static void main(String[] args) {
        
        Audi audi = new Audi("A8", "Red");
        BMW bmw = new BMW("Q5", "Silver");
        Honda honda = new Honda("City", "Blue");
        Mercedes mercedes = new Mercedes("Benz", "Space Blue");

        Driver john = new Driver("John");
        Driver alex = new Driver("Alex");
        Driver khari = new Driver ("Khari");

        john.setCar(bmw);
        john.drive();
        
        khari.setCar(mercedes);
        khari.drive();
    }
}
