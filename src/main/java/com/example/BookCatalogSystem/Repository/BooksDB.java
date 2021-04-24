/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Apr-21
 *   Time: 3:23 PM
 *   File: BooksDB.java
 */

package com.example.BookCatalogSystem.Repository;

import com.example.BookCatalogSystem.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BooksDB {
    ArrayList<Book> booksList= new ArrayList<>();

    public String insertBook(Book book){
        for (Book book1 : booksList) {
            if(book1.getId()==book.getId()){
                return "Id exist already";
            }
        }
        booksList.add(book);
        System.out.println(book);
        return "Book added successfully";
    }
}
