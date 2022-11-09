/**
 *
 * @author kharileigh
 * <----- 
 */

package com.kharileigh.layeredapproachsetup.client;

import java.util.Scanner;

import com.kharileigh.layeredapproachsetup.presentation.EmployeePresentation;
import com.kharileigh.layeredapproachsetup.presentation.EmployeePresentationImpl;

public class LayeredApproachSetUp {

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