/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Apr-21
 *   Time: 3:19 PM
 *   File: BookService.java
 */

package com.example.BookCatalogSystem.Service;

import com.example.BookCatalogSystem.Model.Book;
import com.example.BookCatalogSystem.Repository.BooksDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BooksDB booksDB;
    public String insertBook(Book book){
        return booksDB.insertBook(book);
    }

    public List<Book> getAllBooks() {
        return booksDB.getAllBooks();
    }

    public Book getBookById(long id) {
        return booksDB.getBookById(id);
    }
}

