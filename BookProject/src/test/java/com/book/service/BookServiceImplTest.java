/**
 *
 * @author kharileigh
 */
package com.book.service;

import com.book.entity.Book;
import com.book.persistence.BookDao;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;



import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;



//@RunWith(MockitoJUnitRunner.class)
public class BookServiceImplTest {
    
    
    
    @InjectMocks
    private BookServiceImpl service;
    
    @Mock
    private BookDao dao;
    private AutoCloseable autoCloseable;
    
    
    @BeforeEach
    public void setUp() throws Exception {
        
        MockitoAnnotations.openMocks(this);
    
        autoCloseable = MockitoAnnotations.openMocks(this);
        
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        
        autoCloseable.close();
    }
    
    
    
    @Test
    public void testAddBook() {
        
        
        // when(dao.searchRecord(5)).thenReturn(new Book(5, "Gossip Girl", "New York Blogger", 50000));
        
        // AFTER RETURNING NULL, INSERT RECORD
        when(dao.insertRecord(new Book(5, "Gossip Girl", "New York Blogger", 50000))).thenReturn(null);
        
        assertTrue(service.addBook((new Book(5, "Gossip Girl", "New York Blogger", 50000))));
    }
    
    
    @Test
    public void testAddBook2() {
        
        
        when(dao.searchRecord(5)).thenReturn(null);
    
        assertFalse(service.addBook((new Book(5, "Gossip Girl", "New York Blogger", 50000))));
    }
}
