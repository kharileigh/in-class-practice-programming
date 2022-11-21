/**
 *
 * @author kharileigh
 * <------ STEP 2 : BLUEPRINT OF DATABASE (BookList) ----->
 * <------ STEP 3 : MIMIC DATABASE - map of Book object & put into EmployeeList ----->
 */
package com.book.database;

import com.book.entity.Book;
import java.util.LinkedHashMap;
import java.util.Map;


public class BookDatabase {
    
    static private Map<Integer, Book> bookList = new LinkedHashMap<Integer, Book>();
    
    static {
    
        bookList.put(1, new Book(1, "Lion King", "Mufasah", 40000));
        bookList.put(2, new Book(2, "Ikigai", "Hector Harcia", 40000));
        bookList.put(3, new Book(3, "Coding for Dummies", "Paul McFarlene", 40000));
    }
    
    
    public static Map<Integer, Book> getBookList() {
        return bookList;
    }
}
