/**
 *
 * @author kharileigh
 * <------ CREATE CONFIGURATION FILE TO IMPLEMENT DEPENDENCY INJECTION ------>
 */

package com.kharileigh.layeredapproachsetup.client;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.kharileigh.layeredapproachsetup.persistence.EmployeeDaoImpl;
import com.kharileigh.layeredapproachsetup.presentation.EmployeePresentationImpl;
import com.kharileigh.layeredapproachsetup.service.EmployeeServiceImpl;




@Configuration
public class EmployeeConfiguration {
    
    @Bean(name="dao")
    public EmployeeDaoImpl getPersistence() {
            return new EmployeeDaoImpl();
    }

    @Bean(name="service")
    public EmployeeServiceImpl getEmployeeService() {
            //Constructor Injection -> add constructor to service
            return new EmployeeServiceImpl(getPersistence());
    }

    @Bean(name="empPresentation")
    public EmployeePresentationImpl getEmployeePresentation() {
            //Setter Injection -> add setter to presentation
            EmployeePresentationImpl presentation=new EmployeePresentationImpl();
            presentation.setEmployeeService(getEmployeeService());
            return presentation;
    }
}
