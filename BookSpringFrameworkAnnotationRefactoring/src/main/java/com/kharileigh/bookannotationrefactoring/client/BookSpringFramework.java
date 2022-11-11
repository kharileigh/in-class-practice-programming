/**
 *
 * @author kharileigh
 * 
 */

package com.kharileigh.bookannotationrefactoring.client;

import com.kharileigh.bookannotationrefactoring.presentation.BookPresentation;
import com.kharileigh.bookannotationrefactoring.presentation.BookPresentationImpl;

import java.util.Scanner;

public class BookSpringFramework {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        BookPresentation bookPresentation = new BookPresentationImpl();
        
        while(true) {
            
            bookPresentation.showMenu();
            System.out.println("Enter Your Selection : ");
            
            int userChoice = sc.nextInt();
            bookPresentation.performMenu(userChoice);
        }
    }
}

