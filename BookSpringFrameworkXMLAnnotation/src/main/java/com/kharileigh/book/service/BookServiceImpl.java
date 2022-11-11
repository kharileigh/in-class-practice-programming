/**
 *
 * @author kharileigh
 * <------ STEP 10 : CREATES DAO OBJECT TO TELL GET RETRIEVE/ADD DATA TO DATABASE ------>
 */
package com.kharileigh.book.service;

import com.kharileigh.book.entity.Book;
import com.kharileigh.book.persistence.BookDao;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class BookServiceImpl implements BookService {
    
    private BookDao bookDao;
    
    // ARGS CONSTRUCTOR USING DAO AS ARGUMENT
    public BookServiceImpl(@Autowired BookDao bookDao) {
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
