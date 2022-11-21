/**
 *
 * @author kharileigh
 */
package com.kharileigh.streamsdemo4;

import java.util.ArrayList;
import java.util.List;


public class StreamsDemo4 {

    public static void main(String[] args) {
        
        List<Book> bookList = new ArrayList();

        bookList.add(new Book(1, "Book 1", "Author A", 1200, 5000));
        bookList.add(new Book(2, "Book 2", "Author M", 2100, 2000));
        bookList.add(new Book(3, "Book 3", "Author A", 3000, 6000));
        bookList.add(new Book(4, "Book 4", "Author D", 800, 2800));
        bookList.add(new Book(5, "Book 5", "Author M", 7200, 1100));
        bookList.add(new Book(6, "Book 6", "Author A", 8200, 4300));
        bookList.add(new Book(7, "Book 7", "Author A", 7900, 5600));
        
        bookList.stream()
            
            // MAP - TAKES IN BOOK PRICE, APPLIES DISCOUNT, RETURN NEW BOOK WITH DISCOUNTED PRICE ADDED
            .map(book -> {
                
                BookDiscount bookWithDiscount = null;
                
                // price equal to & greate 5000 gets 10%, less than 500 gets 5%
                if (book.getPrice() >= 5000)
                    bookWithDiscount = new BookDiscount(book, book.getPrice() * .10);
                else if (book.getPrice() < 5000)
                    bookWithDiscount = new BookDiscount(book, book.getPrice() * .5);
                return bookWithDiscount;    
                }
                    
            ).forEach(bookWithDiscount -> System.out.println(bookWithDiscount));
    
    }
}
