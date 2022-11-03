/**
 *
 * @author kharileigh
 */

package com.kharileigh.interfacecolor;


public class Line implements Drawable {
    
    private String color, thickness;
    
    //------- CONSTRUCTOR SETTING DRAWING COLOR & THICKNESS
    public Line() {
        super();
        this.color = color;
        this.thickness = thickness;
    }
    


    //------- IMPLEMENTS ONLY ONE INTERFACE
    @Override
    public void drawingColor() {
        System.out.println( color + " is the drawing color");
    }

    @Override
    public void thickness() {
        System.out.println(thickness + " is the thickness");
    }
    
    
}
