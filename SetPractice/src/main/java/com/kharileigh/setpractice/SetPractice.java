/**
 *
 * @author kharileigh
 */

package com.kharileigh.setpractice;


import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class SetPractice {

    public static void main(String[] args) {
        
        Set<Numbers> numberSet = new LinkedHashSet<Numbers>();
        
        Scanner sc = new Scanner(System.in);
        
        int number;
        
        System.out.println("CREATING A COLLECTION OF NUMBERS");
        System.out.println("================================\n");
        
        
        // FOR LOOP TO ITERATE OVER 10 INDEXES
        for (int index = 0; index < 10; index++) {
            
            // get numbers from user
            System.out.println("Please enter a number: \n");
            
            number = sc.nextInt();
            
            //---- check if number is negative
            if(number < 0) {
                System.out.println("Please enter positive values only! \n");
            }
            
            //----- create object with number entered & current index
            Numbers userNum = new Numbers(number, index);
            
            
            
            //----- check for duplicates of Numbers object in set
            for (Numbers nums : numberSet) {
                
                // if current number is equal to a number in an object stored in set, tell user
                if(nums.getNumber() == number) {
                    System.out.println("Please enter a new number, current entry is already in collection.");
                
                // if not in set already, add to set
                } else {
                    numberSet.add(userNum);
                }
            }
            
            
            //------ print numbers and index to user
            for (Numbers nums : numberSet) {
                System.out.println("\n Here are the numbers in the collection");
                System.out.println("------------------------------------------");
                System.out.println(nums);
            }
            
        }
        
    }
}