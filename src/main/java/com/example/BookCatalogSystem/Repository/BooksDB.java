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
import java.util.List;

@Repository
public class BooksDB {
    ArrayList<Book> booksList= new ArrayList<>();

    public Book getBookById(long id) {
        for (Book book : booksList) {
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }


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

    public List<Book> getAllBooks() {
        return booksList;
    }
}

