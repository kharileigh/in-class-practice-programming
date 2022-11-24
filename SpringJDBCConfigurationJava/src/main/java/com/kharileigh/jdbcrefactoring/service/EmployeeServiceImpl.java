/**
 *
 * @author kharileigh
 * <----- CREATES DAO OBJECT TO TELL GET RETRIEVE/ADD DATA TO DATABASE ------>
 */

package com.kharileigh.jdbcrefactoring.service;

import java.util.Collection;

import com.kharileigh.jdbcrefactoring.entity.Employee;
import com.kharileigh.jdbcrefactoring.entity.EmployeePaySlip;
import com.kharileigh.jdbcrefactoring.persistence.EmployeeDao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
    
        //Service will request persistence layer for all data needs
        @Autowired
	private EmployeeDao employeeDao;
        
        // ARGS CONSTRUCTOR USING DAO AS ARGUMENT
        public EmployeeServiceImpl(@Autowired EmployeeDao employeeDao) {
            this.employeeDao = employeeDao;
        }
	
	@Override
	public Collection<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int id) {
            return employeeDao.searchRecord(id);
	}

	@Override
	public boolean addEmployee(Employee employee) {
            if(employeeDao.insertRecord(employee) > 0) {
                return true;
            } else {
                return false;
            }
	}

        
	@Override
	public boolean deleteEmployee(int id) {
            if(employeeDao.deleteRecord(id) > 0) {
                return true;
            } else {
                return false;
            }
	}

	@Override
	public boolean incrementSalary(int id, double increment) {
            if(employeeDao.updateSalary(id, increment) > 0) {
                return true;
            } else {
                return false;
            }
	}

	/*
	 * Business Rule
	 * AllowancesA : 18% of salary
	 * AllowanceB : 12% of salary
	 * Dedeuction : 8% of salary
	 */
	@Override
	public EmployeePaySlip generatePaySlip(int employeeId) {
            Employee employee=employeeDao.searchRecord(employeeId);
            if(employee!=null) {
                    double allowanceA=.18*employee.getEmpSalary();
                    double allowanceB=.12*employee.getEmpSalary();
                    double deduction=.08*employee.getEmpSalary();
                    double totalSalary=employee.getEmpSalary()+allowanceA+allowanceB-deduction;

                    EmployeePaySlip employeePaySlip=new EmployeePaySlip(employee, allowanceA, allowanceB, deduction,totalSalary);
                    return employeePaySlip;
            }
            return null;
		
	}
        
//        // METHOD TO SEARCH EMPLOYEE BY DEPARTMENT
//        public List<Employee> getEmployeeByDepartment(String department) {
//        
//            // 1st -> LOAD ALL EMPLOYEES INTO A COLLECTION - USE DAO TO GET THEM
//            Collection<Employee> allEmployees = employeeDao.getAllRecords();
//            
//            // 2nd -> CREATE NEW LIST TO TO STORE ONLY THOSE WITH MATCHING DEPARTMENTS (can have duplicates)
//            List<Employee> employeesByDepartment = new ArrayList();
//            
//            // 3RD -> ITERATE OVER COLLECTION - IF MATCHES GIVEN DEPARTMENT - ADD EMPLOYEE TO NEW LIST
//            for(Employee currentEmployee : allEmployees) {
//                if(currentEmployee.getEmpDepartment().equals(department)) {
//                    employeesByDepartment.add(currentEmployee);
//                }
//            }
//            
//            if (employeesByDepartment.size() == 0) {
//                return null;
//            } else {
//                return employeesByDepartment;
//            }
//        }
    
}
