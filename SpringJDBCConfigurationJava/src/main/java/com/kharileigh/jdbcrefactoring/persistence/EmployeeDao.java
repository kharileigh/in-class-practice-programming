/**
 *
 * @author kharileigh
 */
package com.kharileigh.jdbcrefactoring.persistence;

import com.kharileigh.jdbcrefactoring.entity.Employee;
import java.util.Collection;


public interface EmployeeDao {
    
    Collection<Employee> getAllRecords();
    Employee searchRecord(int id);
    int insertRecord(Employee employee);
    int deleteRecord(int id);
    int updateSalary(int id, double increment);
    
}
