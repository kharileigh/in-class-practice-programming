/**
 *
 * @author kharileigh
 * <------- STEP 9 : OVERRIDE FUNCTIONS IN DAO ------->
 */

package com.kharileigh.book.persistence;

import com.kharileigh.book.database.BookDatabase;
import com.kharileigh.book.entity.Book;
import java.util.Collection;
import org.springframework.stereotype.Repository;

@Repository("dao")
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
        return BookDatabase.getBookList().put(book.getBookId(), book);
    }
    
    
}
