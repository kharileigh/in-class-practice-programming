/**
 *
 * @author kharileigh
 * <------ RAISE IF MARKS IS NEGATIVE OR GREATER THAN 100 ------>
 */

package com.kharileigh.studentexception.exceptions;

// USER DEFINED CHECKED EXCEPTION
public class MarksException extends Exception {
    
    // CONSTRUCTOR FOR EXCEPTION
    public MarksException(String message) {
    
        super(message);
    
    }
}
