/**
 *
 * @author kharileigh
 */

package com.kharileigh.setpractice;


public class Numbers {
    
    private int number;
    private int index;

    // default constructor 
    public Numbers() {

    }
    
    // NUMBERS OBJECT 
    public Numbers(int number, int index) {
        this.number = number;
        this.index = index;
    }

    
    // GETTERS & SETTERS
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
    
}
