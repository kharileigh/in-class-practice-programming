/**
 *
 * @author kharileigh
 */
package com.kharileigh.height;


public class TotalHeight {
    
    //-------- DECLARE VARIABLES
    private int feet, inch;

    
    //-------- SETTERS & GETTERS
    public int getFeet() {
        return feet;
    }
    
    public void setFeet(int feet){
        this.feet = feet;
    }
    
    public int getInch() {
        return inch;
    }
    
    public void setInch() {
        this.inch = inch;
    }
    
    
    //-------- SUPER : reference variables used to refer parent class objects
    public TotalHeight() {
        super();
    }
    
    public TotalHeight (int feet, int inch) {
        super();
        this.feet = feet;
        this.inch = inch;
    }
    
    
    //------- SUM OF HEIGHTS -- use TotalHeight as type
    public void sumHeight(TotalHeight person1, TotalHeight person2) {
        this.feet = person1.getFeet() + person2.getFeet();
        this.inch = person2.getInch() + person2.getInch();
        
        if(inch >= 12) {
            feet = feet + inch / 12;
            inch = inch % 12;
        }
    
    
    }
    

}
