/**
 *
 * @author kharileigh
 */
package com.kharileigh.componentproducer;


public class Singer implements Performer {
    
    private String song;
    
    //---- ARGS CONSTRUCTOR
    public Singer(String song) {
        super();
        this.song = song;
    }
    
    @Override
    public void perform() {
        System.out.println("Singer is singing " + song);
    }
}
