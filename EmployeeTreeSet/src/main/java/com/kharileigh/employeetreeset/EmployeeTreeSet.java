/**
 *
 * @author kharileigh
 * <---- Create TreeSet according to the number of years of experience ---->
 * 
 */

package com.kharileigh.employeetreeset;

import java.util.Set;
import java.util.TreeSet;



public class EmployeeTreeSet {

    public static void main(String[] args) {
        
        Set<Employee> employeeSet = new TreeSet<Employee>();
        
        System.out.println(" NEW EMPLOYEES FOR 2022 ");
        System.out.println("========================");
        
        employeeSet.add(new Employee(111, "Khari", 2, "Frontend", "Infrastructure", 25000));
        employeeSet.add(new Employee(222, "Sujata", 22, "Director", "Head Office", 100000));
        employeeSet.add(new Employee(333, "Amara", 3, "Backend", "Media", 33000));
        
        System.out.println("Size : " + employeeSet.size());
        
        System.out.println("List of current employees entered");
        for(Employee emp : employeeSet) {
            System.out.println(emp);
        }
    }
}
