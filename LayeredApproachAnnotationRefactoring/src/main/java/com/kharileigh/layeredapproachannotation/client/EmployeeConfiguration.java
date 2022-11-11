/**
 *
 * @author kharileigh
 * <------ CREATE CONFIGURATION FILE TO IMPLEMENT DEPENDENCY INJECTION ------>
 */

package com.kharileigh.layeredapproachannotation.client;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;




@Configuration
@ComponentScan(basePackages = "com.kharileigh")
public class EmployeeConfiguration {
    
    // EMPTY CONFIGURATION CLASS -> WILL LOOK FOR COMPONENTS ANNOTATED TO RUN
}
