/**
 *
 * @author kharileigh
 * <----- LAUNCH SPRING CONTAINER, WHEN CONFIGURATION FILE IS SUPPLIEED ----->
 */
package com.kharileigh.componentconsumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kharileigh.componentproducer.Performer;


public class PerformerSpringClient {

    public static void main(String[] args) {
        
        ApplicationContext springContainer = new ClassPathXmlApplicationContext("performanceconfig.xml");
        
        Performer performer1=(Performer)springContainer.getBean("Steph");
        performer1.perform();

        Performer performer2=(Performer)springContainer.getBean("Gemma");
        performer2.perform();

        Performer performer3=(Performer)springContainer.getBean("Laura");
        performer3.perform();

        Performer performer4=(Performer)springContainer.getBean("Vic");
        performer4.perform();

        Performer performer5=(Performer)springContainer.getBean("Maria");
        performer5.perform();
        
    }
}
