/**
 *
 * @author kharileigh
 */

package com.kharileigh.studentjavaannotationconfig.client;

import com.kharileigh.studentjavaannotationconfig.presentation.StudentPresentation;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class StudentClient {

    public static void main(String[] args) {
        
        // TAKES IN USER SELCTION FROM MENU
        Scanner sc = new Scanner(System.in);
        
        // CREATE SPRING CONTAINER
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(StudentConfiguration.class);
        
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
