/**
 *
 * @author kharileigh
 */

package com.kharileigh.eggs;


public class TotalEggs {
    
    
    //--------- DECLARE VARIABLES NEEDED
    private int totalEggs, grossEggs, dozenEggs, remainingEggs;

    
    
    //-------- USER WILL INPUT TOTAL EGGS
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

    
    //-------- ADD GROSS REMAINDER & DOZEN REMAINDER TO GET TOTAL REMAINING EGGS USING MODULO
    public int getRemainingEggs() {
        
        remainingEggs = (totalEggs % 144) + (totalEggs % 12);
        return remainingEggs;
    }

    

    
 
    
    
    
    
}
