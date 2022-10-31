/**
 *
 * @author kharileigh
 * <------ REVERSE A GIVEN NUMBER ------->
 */

package com.kharileigh.reversenumber;


public class Reverse {
    
    private int number, reverseNum;
    
    
    // number user will enter to be reversed
    public void setNumber(int number) {
        this.number = number;
    }
    
    // method to display reverse number to user
    public int getReverseNum() {
        calculateReverseNum();
        return reverseNum;
    }
    
    
    private void calculateReverseNum() {
    
        reverseNum = 0;
        
        while (number > 0) {
        
            reverseNum = (reverseNum * 10);
            
            reverseNum = reverseNum + (number % 10);
            
            number = number / 10;
        
        }
        
    
    }
    
    
}
