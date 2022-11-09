/**
 *
 * @author kharileigh
 */

package com.kharileigh.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kharileigh.springframework.demo.GoodAfterNoon;
import com.kharileigh.springframework.demo.GoodEvening;
import com.kharileigh.springframework.demo.GoodMorning;



@Configuration
public class GreetConfiguration {
    
    @Bean(name = "mrng") 
    public GoodMorning getGoodMorning() {
        return new GoodMorning();
    }
    
    @Bean(name = "eve")
    public GoodEvening getGoodEvening() {
        return new GoodEvening();
    }
    
    //---- no bean so should not print to console
    public GoodAfterNoon getGoodAfterNoon() {
        return new GoodAfterNoon();
    }
}
