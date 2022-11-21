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
    void setUp() {
        dao = new BookDaoImpl();
    }

    @AfterEach
    void tearDown() {
        dao = null;
    }
    
    // list all books
    @Test
    void testGetAllBooks () {
        assertTrue(dao.getAllRecords().size() > 0);
    }
    
    @Test
    void testSearchBooks() {
        assertEquals(1, dao.searchRecord(1).getBookId());
    }
    
    @Test
    void testInsertRecord() {
        assertEquals(1, dao.insertRecord(new Book(120, "The Army Kid", "Moses", 50000)));
    }
    
    /*
    @Test 
    void testDeleteRecord() {
        assertEquals(1, dao.deleteRecord(111));
    }
    */
}
