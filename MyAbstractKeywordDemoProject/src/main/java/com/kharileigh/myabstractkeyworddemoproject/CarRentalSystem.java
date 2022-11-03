/**
 *
 * @author kharileigh
 * <------- MULTI LEVEL INHERITANCE ------>
 * <----- GENERAL CLASS IS USED BY DIFFERENT CHILD CLASSES TO SET DIFFERENT USERS OF SAID CLASS ----->
 */

package com.kharileigh.myabstractkeyworddemoproject;


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
