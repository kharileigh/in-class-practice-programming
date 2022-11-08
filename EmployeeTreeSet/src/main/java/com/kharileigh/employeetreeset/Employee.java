/**
 *
 * @author kharileigh
 * <---- Employee id, name, experience, designations, department, salary ---->
 */
package com.kharileigh.employeetreeset;

import java.lang.Comparable;


public class Employee implements Comparable<Employee> {
    
    private int employeeId;
    private String employeeName;
    private int employeeExperience;
    private String employeeDesignations;
    private String employeeDepartment;
    private int employeeSalary;
    

    //---- COMPARE METHOD OVERRIDING FROM OBJECT CLASS
    @Override
    public int compareTo(Employee currentExployee) {
        Employee currentEmployee = new Employee();
        
        if (employeeExperience > currentEmployee.employeeExperience) {
            return 1;
        } else if (employeeExperience < currentEmployee.employeeExperience) {
            return -1;
        } else if (this.equals(currentEmployee)) {
            return 0;
        } else {
            return 1;
        }
        
    }
    
    //---- USE TO CONVERT OBJECTS TO STRING
    @Override
    public String toString() {
        return "Employee Id : " + employeeId + "\nName : " + employeeName + "\nYears Of Experience : " + employeeExperience + "\nDesignations : " + employeeDesignations + "\nDepartment : " + employeeDepartment + "\nSalary : " + employeeSalary + " \n";
    }
    
    
    //---- DEFAULT CONSTRUCTOR
    public Employee() {
    
    }
    
    //---- CONSTRUCTOR WITH PARAMETERS
    public Employee(int employeeId, String employeeName, int employeeExperience, String employeeDesignations, String employeeDepartment, int employeeSalary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeExperience = employeeExperience;
        this.employeeDesignations = employeeDesignations;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }
    
    
}
