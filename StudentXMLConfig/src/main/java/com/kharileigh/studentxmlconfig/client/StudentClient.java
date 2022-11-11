/**
 *
 * @author kharileigh
 */

package com.kharileigh.studentxmlconfig.client;

import com.kharileigh.studentxmlconfig.presentation.StudentPresentation;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentClient {

    public static void main(String[] args) {
        
        // TAKES IN USER SELCTION FROM MENU
        Scanner sc = new Scanner(System.in);
        
        // CREATE SPRING CONTAINER FOR XML CONFIG
       ApplicationContext springContainer = new ClassPathXmlApplicationContext("studentxmlconfig.xml");
        
        // BEAN SHOULD MATCH configuration.xml
        StudentPresentation studentPresentation = (StudentPresentation) springContainer.getBean("studentPresentation");
        
        // TAKES IN USER SELCTION FROM MENU
        while(true) {
            
            studentPresentation.showMenu();
            System.out.println("Enter Your Selection : ");
            
            int choice = sc.nextInt();
            studentPresentation.performMenu(choice);
        }
        
    }
}
