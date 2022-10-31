/**
 *
 * @author kharileigh
 * <------ REVERSE A GIVEN NUMBER ----->
 */

package com.kharileigh.reversenumber;


public class ReverseNumber {

    public static void main(String[] args) {
        
        Reverse reverse = new Reverse();
        
        reverse.setNumber(749);
        
        System.out.println("The reverse of 749 is " + reverse.getReverseNum());
    }
}
