/**
 *
 * @author kharileigh
 *  <------ Data Management Language QUERY ------>
 */

package com.kharileigh.myfirstjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class MyFirstJDBCProject {

    public static void main(String[] args) {
        
        Connection connection = null;
        PreparedStatement preparedStatement;
        Scanner scanner = new Scanner(System.in);

        try {
                // 1. Connect
                // 1.1 Register Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                
                // 1.2 CONNECT TO DATABASE
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "cec1l3r0y!");

                
                // 2. DML QUERY
                preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE(?, ?, ?, ?, ?)");

                System.out.println("Enter Employee ID : ");
                preparedStatement.setInt(1, scanner.nextInt());

                System.out.println("Enter Employee Name : ");
                preparedStatement.setString(2, scanner.next());

                System.out.println("Enter Employee Designation : ");
                preparedStatement.setString(3, scanner.next());

                System.out.println("Enter Employee Department : ");
                preparedStatement.setString(4, scanner.next());

                System.out.println("Enter Employee Salary : ");
                preparedStatement.setDouble(5, scanner.nextDouble());

                
                //DMLL : executeUpdate() , counts number of rows manipulated by query
                int rows = preparedStatement.executeUpdate();

                
                // 3. PROCESS RESULTS
                if (rows > 0) {
                    
                    System.out.println("Employee ADDED");
                    
                } else {
                       
                    System.out.println("Employee NOT ADDED");
                }
                

        } catch (ClassNotFoundException e) {
            
                //displaying the complete stack for exceptions
                e.printStackTrace();
                
        } catch(SQLException e) {
            
                e.printStackTrace();
                
        } finally {
            
                try {
                
                        // 4.CLOSE CONNECTION
                        connection.close();
                        
                } catch (SQLException e) {
                    
                        // TODO : Auto-generated catch block
                        e.printStackTrace();
                }
        }

	
        
    }
}
