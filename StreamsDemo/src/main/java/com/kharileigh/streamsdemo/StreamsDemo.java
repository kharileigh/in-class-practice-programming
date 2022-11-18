/**
 *
 * @author kharileigh
 */

package com.kharileigh.streamsdemo;

import java.util.Arrays;
import java.util.List;


public class StreamsDemo {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(-1, -4, -3, -23, -55);
        
        // RETURN TYPE OF count() FUNCTION IS LONG
        // num is the argument being tested again condition (less than 0)
        long negativeNum = numbers.stream().filter((num) -> num < 0).count();
        
        System.out.println("Total negative numbers " + negativeNum);
    }
}
