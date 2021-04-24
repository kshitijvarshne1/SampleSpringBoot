/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Apr-21
 *   Time: 3:15 PM
 *   File: BookController.java
 */

package com.example.BookCatalogSystem.Controller;

import com.example.BookCatalogSystem.Model.Book;
import com.example.BookCatalogSystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class BookController {

    @Autowired
    BookService bookService;
    // Insert the book
    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    // Show all books
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/getBookById{id}")
    public Book getBookById(@PathVariable long id){
        return bookService.getBookById(id);
    }
}

