/**
 *
 * @author kharileigh
 * <----- CHECKED EXCEPTION RAISED WHEN USER ENTERS AGE OUTSIDE GIVEN BOUNDS ------>
 */
package com.kharileigh.employeeexception;


public class AgeException extends Exception {
    
    public AgeException(String message) {
    
        super(message);
        
    }
}
