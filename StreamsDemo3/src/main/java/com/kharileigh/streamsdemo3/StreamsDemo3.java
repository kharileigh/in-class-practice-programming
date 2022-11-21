/**
 *
 * @author kharileigh
 * <---- CONVERT NEGATIVE INTEGERS TO POSITVE AND PRINT ALL ---->
 */

package com.kharileigh.streamsdemo3;

import java.util.Arrays;
import java.util.List;


public class StreamsDemo3 {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(12, -32, 90, -7, -4, 50);
        
        // STREAM - ITERATES OVER COLLECTION OF DATA
        list.stream
                
        
        .map(t -> {
            if (t < 0) 
                t = t * -1;
            return t;
            }
        ).forEach(t -> System.out.println(t));
        
        
    }
}
