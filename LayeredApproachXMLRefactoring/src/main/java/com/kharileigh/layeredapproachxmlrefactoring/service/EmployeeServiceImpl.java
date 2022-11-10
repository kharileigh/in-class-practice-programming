/**
 *
 * @author kharileigh
 * <----- CREATES DAO OBJECT TO TELL GET RETRIEVE/ADD DATA TO DATABASE ------>
 */

package com.kharileigh.layeredapproachxmlrefactoring.service;

import java.util.Collection;

import com.kharileigh.layeredapproachxmlrefactoring.entity.Employee;
import com.kharileigh.layeredapproachxmlrefactoring.entity.EmployeePaySlip;
import com.kharileigh.layeredapproachxmlrefactoring.persistence.EmployeeDao;
import com.kharileigh.layeredapproachxmlrefactoring.persistence.EmployeeDaoImpl;
import java.util.ArrayList;
import java.util.List;



public class EmployeeServiceImpl implements EmployeeService {
    
        //Service will request persistence layer for all data needs
	private EmployeeDao employeeDao;
        
        //--- ARGS CONSTRUCTOR (passing DAO as argument) -- USED BY CONFIGURATION FILE
        public EmployeeServiceImpl(EmployeeDao employee) {
            super();
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
		Employee emp=employeeDao.searchRecord(employee.getEmpId());
		if(emp!=null) {
			return false;
		}
		employeeDao.insertRecord(employee);
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		Employee employee=employeeDao.deleteRecord(id);
		if(employee!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean incrementSalary(int id, double increment) {
		Employee employee=employeeDao.searchRecord(id);
		if(employee==null) {
			return false;
		}
		employee.setEmpSalary(employee.getEmpSalary()+increment);
		employeeDao.insertRecord(employee);
		return true;
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
        
        // METHOD TO SEARCH EMPLOYEE BY DEPARTMENT
        public List<Employee> getEmployeeByDepartment(String department) {
        
            // 1st -> LOAD ALL EMPLOYEES INTO A COLLECTION - USE DAO TO GET THEM
            Collection<Employee> allEmployees = employeeDao.getAllRecords();
            
            // 2nd -> CREATE NEW LIST TO TO STORE ONLY THOSE WITH MATCHING DEPARTMENTS (can have duplicates)
            List<Employee> employeesByDepartment = new ArrayList();
            
            // 3RD -> ITERATE OVER COLLECTION - IF MATCHES GIVEN DEPARTMENT - ADD EMPLOYEE TO NEW LIST
            for(Employee currentEmployee : allEmployees) {
                if(currentEmployee.getEmpDepartment().equals(department)) {
                    employeesByDepartment.add(currentEmployee);
                }
            }
            
            if (employeesByDepartment.size() == 0) {
                return null;
            } else {
                return employeesByDepartment;
            }
        }
    
}
