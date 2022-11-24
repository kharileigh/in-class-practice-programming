/**
 *
 * @author kharileigh
 */

package com.kharileigh.book;

import com.kharileigh.entity.Book;
import com.kharileigh.persistence.BookDao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BookDaoImplTest {
    
    // do not need beforeEach & AfterEach object because using Autowired
    @Autowired
    BookDao dao;
    
    
    @DisplayName("List All Books")
    @Test
    public void testGetAllBooks() {
        assertTrue(dao.getAllRecords().size() > 0);
    }
    
    @DisplayName("Search Book by ID")
    @Test
    public void testSearchRecord() {
        Book book = new Book(1, "Black Panther", "Chadwick Boseman", 100);
        assertEquals(book, dao.searchRecord(1));
    }
    
//    @DisplayName("Insert Book")
//    @Test
//    public void testInsertRecord() {
//        assertEquals(4, dao.insertRecord(new Book(4, "The Army Kid", "Moses", 50000)).getBookId());
//    }
    
}
