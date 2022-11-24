/**
 *
 * @author kharileigh
 * <----- 
 */

package com.kharileigh.jdbcrefactoring.client;

import java.util.Scanner;

import com.kharileigh.jdbcrefactoring.presentation.EmployeePresentation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientMain {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(ClientConfiguration.class);
		
        EmployeePresentation employeePresentation = (EmployeePresentation)springContainer.getBean("presentation");
		
        while(true) {
            employeePresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice=scanner.nextInt();
            employeePresentation.performMenu(choice);
    }
        
    }
}
