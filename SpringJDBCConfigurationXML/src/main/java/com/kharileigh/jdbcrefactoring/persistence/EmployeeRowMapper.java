/**
 *
 * @author kharileigh
 */

package com.kharileigh.jdbcrefactoring.persistence;

import com.kharileigh.jdbcrefactoring.entity.Employee;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.time.LocalDate;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        int id = rs.getInt("EMPLOYEEID");
        String name = rs.getString("NAME");
        String desig = rs.getString("DESIGNATION");
        String deptt = rs.getString("DEPARTMENT");
        double sal = rs.getDouble("SALARY");
        LocalDate doj = rs.getDate("DOJ").toLocalDate();
 
        Employee employee = new Employee(id, name, desig, deptt, sal, doj);
        return employee;
    }
}
