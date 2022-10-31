/**
 *
 * @author kharileigh
 */

package com.kharileigh.eggs;


public class TotalEggs {
    
    
    // DECLARE VARIABLES NEEDED
    private int totalEggs, grossEggs, dozenEggs, remainingEggs;

    
    // user will input total eggs
    public void setTotalEggs(int totalEggs) {
        this.totalEggs = totalEggs;
    }

    
    //--------- GETTERS FOR GROSS & DOZEN OUTPUTS
    public int getGrossEggs() {
        
        grossEggs = totalEggs / 144;
        return grossEggs;
    }
    
    public int getDozenEggs() {
        
        dozenEggs = totalEggs / 12;
        return dozenEggs;
    }

    // get remainder of gross & dozen, add both remainders to get remaining eggs
    public int getRemainingEggs() {
        
        remainingEggs = (totalEggs % 144) + (totalEggs % 12);
        return remainingEggs;
    }

    

    
 
    
    
    
    
}
