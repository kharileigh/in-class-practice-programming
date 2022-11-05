/**
 *
 * @author kharileigh
 * <------ RAISE IF STUDENT ROLL NO HAS ALREADY BEEN ENTERED ----->
 */
package com.kharileigh.studentexception.exceptions;

// USER DEFINED CHECKED EXCEPTION
public class RollNoException extends Exception {
    
    // CONSTRUCTOR FOR EXCEPTION
    public RollNoException(String message) {
    
        super(message);
    
    }


}
