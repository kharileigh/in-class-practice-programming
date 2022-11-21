/**
 *
 * @author kharileigh
 * <------- STEP 9 : OVERRIDE FUNCTIONS IN DAO ------->
 */

package com.book.persistence;

import com.book.database.BookDatabase;
import com.book.entity.Book;

import java.util.Collection;




public class BookDaoImpl implements BookDao {

    @Override
    public Collection<Book> getAllRecords() {
        return BookDatabase.getBookList().values();
    }

    @Override
    public Book searchRecord(int id) {
       return BookDatabase.getBookList().get(id);
    }

    @Override
    public Book insertRecord(Book book) {
        
        /*
            SHOULD WORK - BUT PROCESSING RUNNING SLOW
            return BookDatabase.getBookList().put(book.getBookId(), book);
        
        */
        
        // currently delayed insertion, returning null
        Book bookToReturn = BookDatabase.getBookList().put(book.getBookId(), book);
        
        // searching for book AFTER INSERTION
        Book newBook = searchRecord(book.getBookId());
 
        return newBook;
    }

    
}
