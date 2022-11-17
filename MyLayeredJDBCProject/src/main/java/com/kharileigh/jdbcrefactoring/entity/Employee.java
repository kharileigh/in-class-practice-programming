/**
 *
 * @author kharileigh
 * <------ 1st STEP : CREATE POJO - encapsulated entity - getters & setters / lombok API -------->
 * 
 */
package com.kharileigh.jdbcrefactoring.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    
    private int empId;
    private String empName;
    private String empDesignation;
    private String empDepartment;
    private double empSalary;
    
    // ADD ANOTHER FIELD IN SQL DATABASE
    private LocalDate dateOfJoining;
    
}