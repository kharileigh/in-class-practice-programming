/**
 *
 * @author kharileigh
 */

package com.kharileigh.lombokdemo;


public class MainEmployee {

    public static void main(String[] args) {
       
        Employee employee = new Employee(111, "Amar",  "Executive","Sales", 12345);
		
		System.out.println(employee);
		
    }
}
