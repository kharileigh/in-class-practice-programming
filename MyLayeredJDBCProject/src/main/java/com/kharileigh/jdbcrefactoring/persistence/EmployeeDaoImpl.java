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



public class EmployeeDaoImpl implements EmployeeDao {
    
   @Override
    public Collection<Employee> getAllRecords() {
        
        Connection connection = null;
	
        PreparedStatement preparedStatement;

        // USE COLLECTION AS ALREADY BEING USED IN METHOD - STORES EMPLOYEES IN DATABASE
        Collection<Employee> employeeList = new ArrayList<Employee>();
        
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "cec1l3r0y!");

                preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {

                        int id = resultSet.getInt("EMPLOYEEID");
                        String name = resultSet.getString("NAME");
                        String desig = resultSet.getString("DESIGNATION");
                        String deptt = resultSet.getString("DEPARTMENT");
                        double sal = resultSet.getDouble("SALARY");
                        LocalDate doj = resultSet.getDate("DOJ").toLocalDate();

                        // GETS ALL EMPLOYEES FROM DATABASE, PUTS THEM IN COLLECTION (employeeList)
                        employeeList.add(new Employee(id, name, desig, deptt, sal, doj));
                }

	} catch (ClassNotFoundException e) {

                e.printStackTrace();

        } catch (SQLException e) {

                e.printStackTrace();
                
        } finally {

                    try {

                                            connection.close();

                    } catch (SQLException e) {

                                            e.printStackTrace();
                    }
        }       
        
        // OUTSIDE TRY- CATCH BLOCK - return collection of employees
        return employeeList;
    }

    
    @Override
    public Employee searchRecord(int id) {
        return null;

    }

    @Override
    public Employee insertRecord(Employee employee) {
        return null;
    }

    @Override
    public Employee deleteRecord(int id) {
        return null;
    } 
    
}
