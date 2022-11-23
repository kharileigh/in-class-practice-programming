/**
 *
 * @author kharileigh
 * <----- DIFFERENT LUNCH DISHES ----->
 * <---- Properties : calories, vegetarian, price---->
 * <---- Behaviour : check if high / low calories --->
 */
package com.kharileigh.enumdemo;


public enum LunchDishes {
    
    CHICKEN_KATSU(550, false, 14.50) {
    
        @Override
        public boolean caloriesCheck() {
            
            System.out.println("Chicken Katsu has " + getCalories() + " calories, is " + isVegetarian() + " vegetarian and the price is " + getPrice());
            if (getCalories() > 600) {
                System.out.println("This meal is high in calories");
                return true;
            } else {
                System.out.println("This mean is LOW in calories");
                return false;
            }
        }
    
    
    }, CARBONARA(700, false, 10.10) {
    
        @Override
        public boolean caloriesCheck() {
            
            System.out.println("Carbonara has " + getCalories() + " calories, is " + isVegetarian() + " vegetarian and the price is " + getPrice());
            if (getCalories() > 600) {
                System.out.println("This meal is high in calories");
                return true;
            } else {
                System.out.println("This mean is LOW in calories");
                return false;
            }
        }
    
    }, JERK_CHICKEN(500, false, 12.50) {
        
        @Override
        public boolean caloriesCheck() {
            
            System.out.println("Jerk Chicken has " + getCalories() + " calories, is " + isVegetarian() + " vegetarian and the price is " + getPrice());
            if (getCalories() > 600) {
                System.out.println("This meal is high in calories");
                return true;
            } else {
                System.out.println("This mean is LOW in calories");
                return false;
            }
        }
    
    };
    
    
    // PROPERTIES
    private int calories;
    private boolean vegetarian;
    private double price;

    
    
    // ALL ARGS CONSTRUCTOR
    private LunchDishes(int calories, boolean vegetarian, double price) {
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
   
    
    // GETTERS FOR PROPERTIES
    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
    
    
    // METHOD TO GIVE CONSTANTS BEHAVIOUR
    public boolean caloriesCheck() {
      
        if (this.calories > 600) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
