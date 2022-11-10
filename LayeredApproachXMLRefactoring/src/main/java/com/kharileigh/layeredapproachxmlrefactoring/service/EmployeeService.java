/**
 *
 * @author kharileigh
 * <------- MAKES CALLS TO DAO TO RETRIEVE & ADD DATA TO DATABASE ------>
 * 
 */

package com.kharileigh.layeredapproachxmlrefactoring.service;

import java.util.Collection;

import com.kharileigh.layeredapproachxmlrefactoring.entity.Employee;
import com.kharileigh.layeredapproachxmlrefactoring.entity.EmployeePaySlip;
import java.util.List;


public interface EmployeeService {
    
    Collection<Employee> getAllEmployees();
	
    Employee searchEmployeeById(int id);

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(int id);

    boolean incrementSalary(int id,double increment);

    EmployeePaySlip generatePaySlip(int employeeId);
    
    List<Employee> getEmployeeByDepartment(String department);
    
}
