/**
 *
 * @author kharileigh
 * <------ POJO USED TO RETURN VALUES ----->
 */

package com.kharileigh.jdbcrefactoring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeePaySlip {
    
    private Employee employee;
    private double allowanceA;
    private double allowanceB;
    private double deduction;
    private double totalSalary;
    
  
}
