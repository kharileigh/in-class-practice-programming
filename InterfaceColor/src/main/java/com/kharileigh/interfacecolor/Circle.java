/**
 *
 * @author kharileigh
 * <------- EXTEND LINE HERE ------>
 */

package com.kharileigh.interfacecolor;


public class Circle extends Line implements Fillable {
    
    private String filling, size;
    
    
    //---------- IMPLEMENTS METHODS FROM LINE CLASS
    public Circle() {
        super();
    }
    
    
    //----------- SETS CIRCLE
    public void  setCircle(String filling, String size) {
        this.filling = filling;
        this.size = size;
    }
    

    
    //------------ IMPLEMENTING INTERFACE METHODS 
   

    @Override
    public void fillingColor() {
        System.out.println(filling + " is the filling color");
    }

    @Override
    public void size() {
        System.out.println(size+ " is the size");
    }
    
}
