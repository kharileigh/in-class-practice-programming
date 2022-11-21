/**
 *
 * @author kharileigh
 */
package com.kharileigh.junitdemo;

// IMPORT EXCEPTION
import com.kharileigh.junitdemo.exceptions.NegativeNumberException;

public class Calculator {
    
    /*
    * Requirement to Test - R001 : Divide 2 Positive Integers
    
    */
    public int divide(int number1, int number2) throws NegativeNumberException {
    
        // MUST USE EQUALS TO INCLUDE 0 IN THE CHECK FOR EXCEPTION
        if (number1 >= 0 && number2 >= 0)
            return number1 / number2;
        else
           throw new NegativeNumberException("Numbers cannot be Negative"); 
    }
    
    /*
    * Requirement - R002 : Add two Positive Integers
    */

    public int add(int number1, int number2) throws NegativeNumberException {
        
        return 0;
    }
}
