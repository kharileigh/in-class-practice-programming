/**
 *
 * @author kharileigh
 */

package com.kharileigh.layeredapproachannotation.persistence;

import java.util.Collection;
import java.util.List;

import com.kharileigh.layeredapproachannotation.database.EmployeeDataBase;
import com.kharileigh.layeredapproachannotation.entity.Employee;
import org.springframework.stereotype.Component;


@Component("dao")
public class EmployeeDaoImpl implements EmployeeDao {
    
   @Override
    public Collection<Employee> getAllRecords() {
        return EmployeeDataBase.getEmployeeList().values();
    }

    @Override
    public Employee searchRecord(int id) {
        return EmployeeDataBase.getEmployeeList().get(id);

    }

    @Override
    public Employee insertRecord(Employee employee) {
        return EmployeeDataBase.getEmployeeList().put(employee.getEmpId(), employee);
    }

    @Override
    public Employee deleteRecord(int id) {
        return EmployeeDataBase.getEmployeeList().remove(id);
    } 
    
}
