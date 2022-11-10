/**
 *
 * @author kharileigh
 * <------ 1st STEP : CREATE POJO - encapsulated entity - getters & setters / lombok API -------->
 * 
 */
package com.kharileigh.layeredapproachsetup.entity;


public class Employee {
    
    private int empId;
    private String empName;
    private String empDesignation;
    private String empDepartment;
    private double empSalary;
    
    //-------- DEFAULT - NO ARG CONSTRUCTOR 
    public Employee() {
    
    }
    
    //------- ALL ARGS CONSTRUCTOR 
    public Employee(int empId, String empName, String empDesignation, String empDepartment, double empSalary) {
        
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    
    }
    
    
    //----- GETTERS & SETTERS TO HANDLE DATA

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    
}
