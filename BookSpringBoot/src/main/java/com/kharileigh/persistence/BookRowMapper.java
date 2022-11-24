/**
 *
 * @author kharileigh
 */
package com.kharileigh.persistence;

import com.kharileigh.entity.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class BookRowMapper implements RowMapper<Book> {
    
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
       
        int id = rs.getInt("BOOKID");
        String name = rs.getString("NAME");
        String authorName = rs.getString("AUTHORNAME");
        int noOfCopies = rs.getInt("NOOFCOPIES");
        
        Book book = new Book(id, name, authorName, noOfCopies);
        return book;
    }
}
