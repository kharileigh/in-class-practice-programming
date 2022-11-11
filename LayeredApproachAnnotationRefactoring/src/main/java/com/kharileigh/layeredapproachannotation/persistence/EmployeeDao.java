/**
 *
 * @author kharileigh
 */
package com.kharileigh.layeredapproachannotation.persistence;

import com.kharileigh.layeredapproachannotation.entity.Employee;
import java.util.Collection;


public interface EmployeeDao {
    
    Collection<Employee> getAllRecords();
    Employee searchRecord(int id);
    Employee insertRecord(Employee employee);
    Employee deleteRecord(int id);
    
}
