/**
 *
 * @author kharileigh
 * 
 */

package com.book.client;

import com.book.presentation.BookPresentation;
import com.book.presentation.BookPresentationImpl;

import java.util.Scanner;

public class BookProject {

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

