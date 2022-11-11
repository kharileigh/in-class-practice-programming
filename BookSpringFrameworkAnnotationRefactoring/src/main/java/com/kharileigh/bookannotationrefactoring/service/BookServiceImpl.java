/**
 *
 * @author kharileigh
 * <------ STEP 10 : CREATES DAO OBJECT TO TELL GET RETRIEVE/ADD DATA TO DATABASE ------>
 */
package com.kharileigh.bookannotationrefactoring.service;

import com.kharileigh.bookannotationrefactoring.entity.Book;
import com.kharileigh.bookannotationrefactoring.persistence.BookDao;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component("service")
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
        // create new object and use Dao to search 
        Book newBook = bookDao.searchRecord(book.getBookId());
        if(newBook != null) {
            return false;
        } else {
            bookDao.insertRecord(book);
            return true;
        }
    }
    
    
}
