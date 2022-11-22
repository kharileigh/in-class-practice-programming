/**
 *
 * @author kharileigh
 * <------ STEP 10 : CREATES DAO OBJECT TO TELL GET RETRIEVE/ADD DATA TO DATABASE ------>
 */
package com.book.service;

import com.book.entity.Book;
import com.book.persistence.BookDao;
import java.util.Collection;


public class BookServiceImpl implements BookService {
    
    private BookDao bookDao;
    
    // ARGS CONSTRUCTOR USING DAO AS ARGUMENT
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Collection<Book> getAllBooks() {
        return bookDao.getAllRecords();
    }

    @Override
    public Book searchBookById(int id) {
        return bookDao.searchRecord(id);
    }

    @Override
    public boolean addBook(Book book) {
        
        if(bookDao.insertRecord(book) != null ) {
        
            return true;
            
        } else {
            
            return false;
        
        }
        
        /*
        Book bk = bookDao.searchRecord(book.getBookId());
        
        if (bk != null) {
            return false;
        }
        bookDao.insertRecord(book);
        return true;
        
        */
    }
    
    
}
