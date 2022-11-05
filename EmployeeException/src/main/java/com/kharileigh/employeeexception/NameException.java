/**
 *
 * @author kharileigh
 * <----- CHECKED EXCEPTION RAISED WHEN USER ENTERS EMPLOYEE NAME THAT HAS ALREADY BEEN ENTERED ------>
 */
package com.kharileigh.employeeexception;

//--------- USER DEFINED EXCEPTION
public class NameException extends Exception {
    
    public NameException(String message) {
        
        super(message);
        
    }
}
