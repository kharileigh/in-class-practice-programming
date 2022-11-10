/**
 *
 * @author kharileigh
 * <----- LAUNCH SPRING CONTAINER, WHEN CONFIGURATION FILE IS SUPPLIEED ----->
 */
package com.kharileigh.componentconsumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PerformerSpringClient {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(PerformerSpringConfiguration.class);
        
    }
}
