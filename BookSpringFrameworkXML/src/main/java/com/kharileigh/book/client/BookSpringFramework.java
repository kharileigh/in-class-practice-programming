/**
 *
 * @author kharileigh
 * 
 */

package com.kharileigh.book.client;

import com.kharileigh.book.presentation.BookPresentation;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookSpringFramework {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ApplicationContext springContainer = new ClassPathXmlApplicationContext("bookconfiguration.xml");
      
        BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("bkPresentation");
        
        while(true) {
            
            bookPresentation.showMenu();
            System.out.println("Enter Your Selection : ");
            
            int userChoice = sc.nextInt();
            bookPresentation.performMenu(userChoice);
        }
    }
}

