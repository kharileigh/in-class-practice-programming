/**
 *
 * @author kharileigh
 * <----- 1st : Create Business Logic functionality ------>
 */

package com.kharileigh.model.service;


import org.springframework.stereotype.Service;


@Service
public class PalindromeService {
    
    private int number, mirroredNum;
    private boolean palindrome;
    
    
    // SETTER - number to be checked
    public void setNumber(int number) {
        this.number = number;
    }
    
    // GETTER - check if number is palindrome or not (calls function to check, then returns true or false)
    public boolean isPalindrome(int number) {
         while(number > 0) {
            
            int remainder = number % 10;
            mirroredNum = mirroredNum * 10 + remainder;
            number = number / 10;
        }
        return palindrome;
    }
    
    
   
}
