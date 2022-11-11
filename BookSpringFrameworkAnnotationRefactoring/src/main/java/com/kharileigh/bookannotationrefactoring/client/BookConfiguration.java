/**
 *
 * @author kharileigh
 * 
 */

package com.kharileigh.bookannotationrefactoring.client;

import com.kharileigh.bookannotationrefactoring.persistence.BookDaoImpl;
import com.kharileigh.bookannotationrefactoring.presentation.BookPresentationImpl;
import com.kharileigh.bookannotationrefactoring.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kharileigh")
public class BookConfiguration {
    
   // EMPTY CLASS
}
