/**
 *
 * @author kharileigh
 */
package com.kharileigh.layeredapproachsetup.persistence;

import com.kharileigh.layeredapproachsetup.entity.Employee;
import java.util.Collection;


public interface EmployeeDao {
    
    Collection<Employee> getAllRecords();
    Employee searchRecord(int id);
    Employee insertRecord(Employee employee);
    Employee deleteRecord(int id);
    
}
