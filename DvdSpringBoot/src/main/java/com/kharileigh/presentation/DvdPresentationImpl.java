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
import java.util.List;
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
        System.out.println("3. Search By DVD Release Date");
        System.out.println("4. Search Total DVD by Release Date : ");
        System.out.println("5. Add New DVD");
        System.out.println("6. Exit");
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
                    
            case 3 :
                    System.out.println("Enter DVD Release Date (YYYY-MM-DD) : ");
                    DateTimeFormatter dateF = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("YYYY-MM-DD")).toFormatter();
                    String date = sc.next().formatted(dateF);
                    
                    List<Dvd> dvdReleaseDate = service.getDvdsByReleaseDate(date);
                    
                    if(dvdReleaseDate.size() != 0) {
                        for(Dvd r : dvdReleaseDate){
                            System.out.println(r);
                        }

                    } else {
                        System.out.println("No DVD with Release Date after : " + date);
                    }
                    break;
                    
            case 4 :
                    System.out.println("Enter DVD Release Date (YYYY-MM-DD) : ");
                    DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("YYYY-MM-DD")).toFormatter();
                    String rDate = sc.next().formatted(dateFormatter);
                    
                    int totalDvds = service.countDvdsByReleaseDate(rDate);
                    System.out.println(totalDvds);
                    break;
                    
            case 5:
                    Dvd newDvd = new Dvd();
                    
                    System.out.println("\nEnter DVD ID : ");
                    newDvd.setDvdId(sc.nextInt());
                    
                    sc.nextLine(); // clearing the buffer
                    System.out.println("\nEnter DVD Title : ");
                    newDvd.setTitle(sc.nextLine());
                    
                    System.out.println("\nEnter DVD Release Date (YYYY-MM-DD) : ");
                    DateTimeFormatter df = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("YYYY-MM-DD")).toFormatter();
                    newDvd.setReleaseDate(sc.nextLine().formatted(df));
                    
                    System.out.println("\nEnter Director's Name : ");
                    newDvd.setDirector(sc.nextLine());
                    
                    System.out.println("\nEnter Production Studio : ");
                    newDvd.setStudio(sc.nextLine());
                    
                    if(service.addDvd(newDvd)) {
                        System.out.println("\nDVD ADDED TO LIBRARY");
                    } else {
                        System.out.println("\nDVD with ID : " + newDvd.getDvdId() + " already exists in DVD Library, so cannot be added.");
                    }
                    break;
                    
            case 6:
                    System.out.println("Thank you for using DVD LIBRARY");
                    System.exit(0);
                    
            default:
                    System.out.println("Invalid Choice!");
                    break;
        }
    }
    
}
