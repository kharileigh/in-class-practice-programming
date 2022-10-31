/**
 *
 * @author kharileigh
 * <----- DISPLAY NUMBER OF EGGS REMAINING ----->
 * - Consider user has N eggs
 * - Display number of eggs in gross (144)
 * - Display number of eggs in dozen (12)
 * - Number of eggs left out remaining
 * - Total as INPUT
 * - DISPLAY -> how many gross -- how many dozen -- how many left over
 */

package com.kharileigh.eggs;

import java.util.Scanner;


public class Eggs {

    public static void main(String[] args) {
        
        
        // ask user total number of eggs they have
        Scanner sc = new Scanner(System.in);
        
        // instantiate TotalEggs object
        TotalEggs eggs = new TotalEggs();
        
        System.out.println("How many eggs do you have in total?");
        String input = sc.nextLine();
        int UI = Integer.parseInt(input);
        
        eggs.setTotalEggs(UI);

        System.out.println("You have " + eggs.getGrossEggs() + " gross eggs, " + eggs.getDozenEggs() + " dozen eggs and " + eggs.getRemainingEggs() + " remaining leftover.");
               
    }
}
