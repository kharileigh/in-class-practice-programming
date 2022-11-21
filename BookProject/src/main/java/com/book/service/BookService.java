/**
 *
 * @author kharileigh
 * <------ STEP 5 : MAKES CALLS TO DAO TO RETRIEVE & ADD DATA TO DATABASE ------>
 */

package com.book.service;

import com.book.entity.Book;

import java.util.Collection;


public interface BookService {
    
    // COLLECTION FOR ALL BOOKS
    Collection<Book> getAllBooks();
    
    // BOOK OBJECT TO SEARCH BY ID
    Book searchBookById(int id);
    
    // BOOLEAN TO CHECK IF BOOK EXISTS BEFORE ADDING NEW BOOK OBJECT
    boolean addBook(Book book);
}
