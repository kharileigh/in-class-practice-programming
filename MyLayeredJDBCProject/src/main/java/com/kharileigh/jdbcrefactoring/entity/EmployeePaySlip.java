/**
 *
 * @author kharileigh
 * <------ POJO USED TO RETURN VALUES ----->
 */

package com.kharileigh.jdbcrefactoring.entity;


public class EmployeePaySlip {
    
    private Employee employee;
    private double allowanceA;
    private double allowanceB;
    private double deduction;
    private double totalSalary;
    
    
    //------ NO ARG CONSTRUCTOR
    public EmployeePaySlip() {
    
    }
    
    
    //----- ALL ARGS CONSTRUCTOR
    public EmployeePaySlip(Employee employee, double allowanceA, double allowanceB, double deduction, double totalSalary) {
        this.employee = employee;
        this.allowanceA = allowanceA;
        this.allowanceB = allowanceB;
        this.deduction = deduction;
        this.totalSalary = totalSalary;
    }
    
    //---- GETTERS & SETTERS TO MANIPULATE DATA

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getAllowanceA() {
        return allowanceA;
    }

    public void setAllowanceA(double allowanceA) {
        this.allowanceA = allowanceA;
    }

    public double getAllowanceB() {
        return allowanceB;
    }

    public void setAllowanceB(double allowanceB) {
        this.allowanceB = allowanceB;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
    
}
