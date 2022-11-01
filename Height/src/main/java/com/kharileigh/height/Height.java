/**
 *
 * @author kharileigh
 * <------ CREATE SUM OF TWO HEIGHTS ----->
 */

package com.kharileigh.height;

import java.util.Scanner;


public class Height {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        
        // ASK USER FOR FIRST THEIR HEIGHT - feet
        System.out.println("What is your height in feet?");
        String input1 = sc.nextLine();
        int person1Feet = Integer.parseInt(input1);
        
        // and inches
        System.out.println("Any inches leftover?");
        String input2 = sc.nextLine();
        int person1Inch = Integer.parseInt(input2);
        
        // new object for person 1
        TotalHeight person1 = new TotalHeight(person1Feet, person1Inch);
        
   
        
        // ASK USER FOR THEIR FRIEND'S HEIGHT - feet
        System.out.println("What is your best friend's height in feet?");
        String input3 = sc.nextLine();
        int person2Feet = Integer.parseInt(input3);
        
        System.out.println("And any inches leftover?");
        String input4 = sc.nextLine();
        int person2Inch = Integer.parseInt(input4);
        
        // new object for person 2
        TotalHeight person2 = new TotalHeight(person2Feet, person2Inch);
        
        
        // new object to calculate sum of both objects
        TotalHeight totalHeight = new TotalHeight();
        totalHeight.sumHeight(person1, person2);
        
        // print to user
        System.out.println("The total height of yourself and your friend is " + totalHeight.getFeet() + " feet " + totalHeight.getInch() + " inch.");
        
    }
}
