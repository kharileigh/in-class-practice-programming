/**
 *
 * @author kharileigh
 * <------ OVERRIDES INTERFACE METHOD & ADDS DEFAULT CONSTRUCTOR ------->
 */

package com.kharileigh.springframework.demo;


public class GoodEvening implements Greet {
    
    public GoodEvening() {
        System.out.println("GoodEvening Constructor");
    }
    
    @Override
    public void wish(String name) {
        System.out.println("Good Evening " + name);
    }
}
