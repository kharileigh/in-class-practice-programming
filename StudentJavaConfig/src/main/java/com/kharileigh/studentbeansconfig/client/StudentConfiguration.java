/**
 *
 * @author kharileigh
 */

package com.kharileigh.studentbeansconfig.client;

import com.kharileigh.studentbeansconfig.persistence.StudentDaoImpl;
import com.kharileigh.studentbeansconfig.presentation.StudentPresentationImpl;
import com.kharileigh.studentbeansconfig.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfiguration {
    
    @Bean(name = "dao")
    public StudentDaoImpl getPersistenceLayer() {
        return new StudentDaoImpl();
    }
    
    // CALLS PERSISTENCE LAYER - constructor injection
    @Bean(name = "service")
    public StudentServiceImpl getServiceLayer() {
        
        return new StudentServiceImpl(getPersistenceLayer());
    }
    
    // CREATES NEW IMPL OBJECT - CALLS SERVICE LAYER - setter injection
    @Bean(name = "studentPresentation")
    public StudentPresentationImpl getPresentationLayer() {
        
        StudentPresentationImpl presentation = new StudentPresentationImpl();
        
        presentation.setStudentService(getServiceLayer());
        
        return presentation;
                
    }
    
}
