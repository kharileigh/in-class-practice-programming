/**
 *
 * @author kharileigh
 * <--------- RAISES IF AGE IS OUT OF BOUNDS ------>
 */

package com.kharileigh.studentexception.exceptions;

// USER DEFINED CHECKED EXCEPTION
public class AgeException extends Exception {
    
    // CONSTRUCTOR FOR EXCEPTION
    public AgeException(String message) {
    
        super(message);
    
    }
}
