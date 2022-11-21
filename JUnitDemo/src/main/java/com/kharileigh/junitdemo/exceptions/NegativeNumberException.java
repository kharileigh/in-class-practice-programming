/**
 *
 * @author kharileigh
 */

package com.kharileigh.junitdemo.exceptions;


// EXCEPTION IS PARENT CLASS OF ALL CHECKED EXCEPTIONS - exceptions at compile time
public class NegativeNumberException extends Exception {
    
    public NegativeNumberException(String message) {
        super(message);
    }
}
