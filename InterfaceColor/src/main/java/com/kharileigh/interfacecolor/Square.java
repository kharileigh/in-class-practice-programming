/**
 *
 * @author kharileigh
 * <------- EXTEND LINE HERE ------>
 */

package com.kharileigh.interfacecolor;


public class Square extends Line implements Drawable, Fillable {

    private String filling, size;
    
    //---------- IMPLEMENTS METHODS FROM LINE CLASS
    public Square() {
        super();
    }
    
    
    //----------- SETS CIRCLE
    public void  setSquare(String filling, String size) {
        this.filling = filling;
        this.size = size;
    }
    
    
    
    //---------- IMPLEMENTING INTERFACE METHODS
    @Override
    public void fillingColor() {
        System.out.println(filling + " is the filling color");
    }

    @Override
    public void size() {
        System.out.println(size + " is the size");
    }
    
}
