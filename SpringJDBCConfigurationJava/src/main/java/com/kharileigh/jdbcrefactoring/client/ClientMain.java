/**
 *
 * @author kharileigh
 * <----- 
 */

package com.kharileigh.jdbcrefactoring.client;

import java.util.Scanner;

import com.kharileigh.jdbcrefactoring.presentation.EmployeePresentation;
import com.kharileigh.jdbcrefactoring.presentation.EmployeePresentationImpl;

public class ClientMain {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
		
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}
        
    }
}
