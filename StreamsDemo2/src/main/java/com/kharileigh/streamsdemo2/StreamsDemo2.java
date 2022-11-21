/**
 *
 * @author kharileigh
 * 
 * <----- TAKE A LIST OF NEGATIVE INTEGERS, MAKE THEM POSITIVE THEN PRINT ----->
 */

package com.kharileigh.streamsdemo2;

import java.util.Arrays;
import java.util.List;


public class StreamsDemo2 {

    public static void main(String[] args) {
        
        
        List <Integer> numList = Arrays.asList(15, -20, -46, -22 -40);
        
        numList.stream()
                
        // TAKES 1 INPUT, CONVERTS FORMAT INTO ANOTHER, THEN RETURNS A TYPE
        .map((e) -> e * -1)
                
        // DISPLAYS DATA
        .forEach((e) -> System.out.println(e));
        
    }
    
}
