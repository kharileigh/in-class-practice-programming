/**
 *
 * @author kharileigh
 * 
 */

package com.kharileigh.bookannotationrefactoring.client;

import com.kharileigh.bookannotationrefactoring.presentation.BookPresentation;
import com.kharileigh.bookannotationrefactoring.presentation.BookPresentationImpl;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookSpringFramework {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(BookConfiguration.class);
        
        BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("bkPresentaion");
        
        while(true) {
            
            bookPresentation.showMenu();
            System.out.println("Enter Your Selection : ");
            
            int userChoice = sc.nextInt();
            bookPresentation.performMenu(userChoice);
        }
    }
}

