/**
 *
 * @author kharileigh
 */

package com.kharileigh.presentation;

import com.kharileigh.entity.Dvd;
import com.kharileigh.service.DvdService;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Collection;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("presentation")
public class DvdPresentationImpl implements DvdPresentation {

    @Autowired
    private DvdService service;
    
    @Override
    public void showMenu() {
        
        System.out.println("=============================================");
        System.out.println("DVD LIBRARY");
        System.out.println("1. List All DVDs");
        System.out.println("2. Search DVD By ID");
        System.out.println("3. Add New DVD");
        System.out.println("4. Exit");
        System.out.println("=============================================");
    }

    @Override
    public void performMenu(int choice) {
        
        Scanner sc = new Scanner(System.in);
        
        switch(choice) {
        
            case 1:
                    Collection<Dvd> dvds = service.getAllDvds();
                    
                    for(Dvd dvd : dvds) {
                        System.out.println(dvd);
                    }
                    break;
                    
            case 2:
                    System.out.println("Enter DVD ID : ");
                    int dvdId = sc.nextInt();
                    
                    Dvd dvd = service.searchDvdById(dvdId);
                    if (dvd != null) {
                        System.out.println(dvd);
                    } else {
                        System.out.println("Employee with ID : " + dvdId + " does not exist in DVD Library");
                    }
                    break;
                    
            case 3:
                    Dvd newDvd = new Dvd();
                    
                    System.out.println("Enter DVD ID : ");
                    newDvd.setDvdId(sc.nextInt());
                    
                    System.out.println("Enter DVD Title : ");
                    newDvd.setTitle(sc.next());
                    
                    System.out.println("Enter DVD Release Date (YYYY-MM-DD) : ");
                    
                    DateTimeFormatter df = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("YYYY-MM-DD")).toFormatter();
                    
                    newDvd.setReleaseDate(sc.next().formatted(df));
                    
                    if(service.addDvd(newDvd)) {
                        System.out.println("DVD ADDED TO LIBRARY");
                    } else {
                        System.out.println("DVD with ID : " + newDvd.getDvdId() + " already exists in DVD Library, so cannot be added.");
                    }
                    break;
                    
            case 4:
                    System.out.println("Thank you for using DVD LIBRARY");
                    System.exit(0);
                    
            default:
                    System.out.println("Invalid Choice!");
                    break;
        }
    }
    
}
