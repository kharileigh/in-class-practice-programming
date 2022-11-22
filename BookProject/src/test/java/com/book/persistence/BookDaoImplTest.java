/**
 *
 * @author kharileigh
 */

package com.book.persistence;

import com.book.persistence.BookDao;
import com.book.persistence.BookDaoImpl;
import com.book.entity.Book;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BookDaoImplTest {
    
    BookDao dao;
    
    @BeforeEach
    public void setUp() {
        dao = new BookDaoImpl();
    }

    @AfterEach
    public void tearDown() {
        dao = null;
    }
    
    // list all books
    @Test
    public void testGetAllBooks () {
        assertTrue(dao.getAllRecords().size() > 0);
    }
    
    @Test
    public void testSearchBooks() {
        assertEquals(1, dao.searchRecord(1).getBookId());
    }
    
    // EXPECTED RESULT MUST MATCH RETURN TYPE (id)
    @Test
    public void testInsertRecord() {
    
        assertEquals(4, dao.insertRecord(new Book(4, "The Army Kid", "Moses", 50000)).getBookId());
    }
    
    
    /*
    @Test 
    void testDeleteRecord() {
        assertEquals(1, dao.deleteRecord(111));
    }
    */
}
