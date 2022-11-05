/**
 *
 * @author kharileigh
 * <---------- IMPLEMENTATION OF EXCEPTION HANDLING -------->
 * <----- need new class holding array of employees, pulling from this ---->
 */
package com.kharileigh.employeeexception;


public class Employee {
    
    private int age;
    private String name;
    public String[] employeeNames;
    
    //----------- DEFAULT CONSTRUCTOR
    public Employee() {
    
    }
    
    
    //------------ CONSTRUCTOR WITH PARAMETERS WITH CHECKED EXCEPTION
    public Employee( String name, int age) throws AgeException {
        
        if (age >= 18 || age <= 60) {
            
            this.name = name;
            this.age = age;
            
        } else {
            throw new AgeException("Age must be between 18 - 60 years old.");
        } 
    }
    
    
    //------------- DISPLAY EMPLOYEE DETAILS
    public void display() {
        System.out.println("NAME : " + name);
        System.out.println("AGE : " + age);
    }
    
    
    
    
    //------------- GETTERS & SETTERS
    public int getAge() {
        return age;
    }

    //------ MUST CHECK FOR AGE
    public void setAge(int age) throws AgeException {
        if (age >= 18 || age <= 60) {
            this.age = age;
            
        } else {
            throw new AgeException("Age must be between 18 - 60 years old.");
        }
        
    }
    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
       
        this.name = name;
    
    }
  

    //------- IF ARRAY CONTAINS NAME, SET 
    public void setEmployeeNames() throws NameException {
        if (employeeNames.equals(name)) {
            throw new NameException("Name is already is list, please enter a new name.");
        }
        this.employeeNames = employeeNames;
    }
    
}
