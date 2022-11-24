/**
 *
 * @author kharileigh
 */

package com.kharileigh.persistence;


import com.kharileigh.entity.Book;
import java.util.Collection;


public interface BookDao {
    
    Collection<Book> getAllRecords();
    Book searchRecord(int id);
    int insertRecord(Book book);
    int updateNoOfCopies(int id, int increment);
}
