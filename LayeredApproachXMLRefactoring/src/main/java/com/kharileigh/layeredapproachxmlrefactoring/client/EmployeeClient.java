/**
 *
 * @author kharileigh
 * <----- 
 */

package com.kharileigh.layeredapproachxmlrefactoring.client;

import java.util.Scanner;

import com.kharileigh.layeredapproachxmlrefactoring.presentation.EmployeePresentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
		
                ApplicationContext springContainer = new ClassPathXmlApplicationContext("employeeconfiguration.xml");
                
		EmployeePresentation employeePresentation = (EmployeePresentation) springContainer.getBean("employeePresentation");
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}
        
    }
}
