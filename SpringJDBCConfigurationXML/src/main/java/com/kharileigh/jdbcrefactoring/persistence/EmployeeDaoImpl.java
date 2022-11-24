/**
 *
 * @author kharileigh
 */

package com.kharileigh.jdbcrefactoring.persistence;

import java.util.Collection;

import com.kharileigh.jdbcrefactoring.entity.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    
    // PROPERTY FOR JDBC
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    
   @Override
    public Collection<Employee> getAllRecords() {
        
        String query = "SELECT * FROM EMPLOYEE";
        List<Employee> empList = jdbcTemplate.query(query, new EmployeeRowMapper());
        return empList;
    }

    //-------- NEEDS EXCEPTION HANDLING
    @Override
    public Employee searchRecord(int id) {
        
        Employee employee = null;
        
        try {

                String query = "SELECT * FROM EMPLOYEE WHERE EMPLOYEEID=?";
                employee = jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), id);
        
        } catch (EmptyResultDataAccessException ex) {
                return null;
        }
        return employee;

    }
    
    //-------- NEEDS EXCEPTION HANDLING
    @Override
    public int insertRecord(Employee employee) {
        
        try {
            String query = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)";

            int rows = jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(), employee.getEmpDepartment(), employee.getEmpSalary(), employee.getDateOfJoining());

            return rows;
        
        } catch (DuplicateKeyException ex) {
            return 0;
        }
    }
    
   
    
    @Override
    public int deleteRecord(int id) {
        
        String query = "DELETE FROM EMPLOYEE WHERE EMPLOYEEID=?";
        
        int rows = jdbcTemplate.update(query, id);
        
        return rows;
    } 
    
    
    
    @Override
    public int updateSalary(int id, double increment) {
    
        String query = "UPDATE EMPLOYEE SET SALARY = SALARY+? WHERE EMPLOYEEID=?";
        
        int rows = jdbcTemplate.update(query, increment, id);
        
        return rows;
    }
}
