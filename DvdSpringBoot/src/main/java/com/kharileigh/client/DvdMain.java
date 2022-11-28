package com.kharileigh.client;

import com.kharileigh.presentation.DvdPresentation;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.kharileigh.entity")
@EnableJpaRepositories(basePackages = "com.kharileigh.persistence")
@ComponentScan(basePackages = "com.kharileigh.presentation, com.kharileigh.service")
public class DvdMain {

	public static void main(String[] args) {
		
            ApplicationContext springContainer = SpringApplication.run(DvdMain.class, args);
            
            Scanner sc = new Scanner(System.in);
            
            DvdPresentation dvdPresentation = (DvdPresentation)springContainer.getBean("presentation");
            
            while(true){
                dvdPresentation.showMenu();
                
                System.out.println("Please select choice from menu : ");
                
                int choice = sc.nextInt();
                dvdPresentation.performMenu(choice);
            }
	}

}
