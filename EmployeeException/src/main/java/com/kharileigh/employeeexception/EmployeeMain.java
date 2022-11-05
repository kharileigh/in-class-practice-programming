/**
 *
 * @author kharileigh
 * <------- USE LOOP TO CHECK EMPLOYEE NAME & AGE ------->
 */
package com.kharileigh.employeeexception;

import java.util.Scanner;


public class EmployeeMain {
    
    Scanner sc = new Scanner(System.in);
    
    
    try {

        Employee employee = new Employee();
        
        System.out.println("Please enter Employee Name : ");
        String employeeName = sc.next();
        employee.setName(employeeName);
        
        System.out.println("\n Please enter Employee Age : ");
        String input = sc.next();
        int employeeAge = Integer.parseInt(input);
        employee.setAge(employeeAge);
    }
    
}
