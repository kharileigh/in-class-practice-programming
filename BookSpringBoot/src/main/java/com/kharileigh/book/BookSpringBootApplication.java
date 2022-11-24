package com.kharileigh.book;

import com.kharileigh.presentation.BookPresentation;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// need to scan packages to find annotated components
@SpringBootApplication(scanBasePackages = "com.kharileigh")
public class BookSpringBootApplication {

	public static void main(String[] args) {
            
            ApplicationContext springContainer = SpringApplication.run(BookSpringBootApplication.class, args);
            
            Scanner sc = new Scanner(System.in);
            
            BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("bkPresentation");
	}

}
