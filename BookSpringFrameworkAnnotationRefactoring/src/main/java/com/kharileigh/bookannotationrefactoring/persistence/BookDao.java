/**
 *
 * @author lidija
 * <------- STEP 4 : CREATE DATA ACCESS OBJECT ----->
 * 
 */

package com.kharileigh.bookannotationrefactoring.persistence;

import com.kharileigh.bookannotationrefactoring.entity.Book;
import java.util.Collection;


public interface BookDao {
    
    Collection<Book> getAllRecords();
    Book searchRecord(int id);
    Book insertRecord(Book book);
}
