/**
 *
 * @author kharileigh
 */

package com.kharileigh.springframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kharileigh.springframework.demo.Greet;


public class GreetClient {

    public static void main(String[] args) {
        
        //----- SPRING CONTAINER KNOWS ABOUT FILES TO CREATE COMPONENTS FOR BY CONFIGURATION FILE
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(GreetConfiguration.class);
        

        Greet greet = (Greet)springContainer.getBean("mrng");
        
        greet.wish("Khari");
    }
}
