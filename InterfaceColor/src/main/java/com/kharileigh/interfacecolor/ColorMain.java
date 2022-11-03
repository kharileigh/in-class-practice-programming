/**
 *
 * @author kharileigh
 */

package com.kharileigh.interfacecolor;


public class ColorMain {

    public static void main(String[] args) {
        
        //------- INSTANTIATE CIRCLE & SQUARE
        Circle circle = new Circle();
        Square square = new Square ();
        
        square.drawingColor();
        square.fillingColor();
        
        circle.thickness();
        circle.size();
        
    }
}
