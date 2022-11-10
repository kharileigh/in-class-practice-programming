/**
 *
 * @author kharileigh
 */
package com.kharileigh.componentconsumer;

import com.kharileigh.componentproducer.Dancer;
import com.kharileigh.componentproducer.Juggler;
import com.kharileigh.componentproducer.Singer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class PerformerSpringConfiguration {
    
    // name is a part of Bean to give this new method a new name different from its method
    @Bean(name = "singer")
    public Singer getSinger() {
        return new Singer("Baby Go Back!");
    }
    
   
	
    @Bean(name="Laura")
    public Juggler getJuggler() {
            Juggler juggler=new Juggler();
            //SETTER INJECTION
            juggler.setBalls(5);
            return juggler;
    }

    @Bean(name="Steph")
    public Dancer getDancer() {
            Dancer dancer=new Dancer();
            //SETTER INJECTION
            dancer.setStyle("Salsa");
            return dancer;
    }


    @Bean(name="Vic")
    public Dancer getDancer1() {
            Dancer dancer=new Dancer();
            //SETTER INJECTION
            dancer.setStyle("Moon Walk");
            return dancer;
    }
}
