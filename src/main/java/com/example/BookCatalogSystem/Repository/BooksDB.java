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
    ArrayList<Book> booksList = new ArrayList<>();

    public String saveBook(Book book) {
        for (Book books : booksList) {
            if (books.getId() == book.getId()) {
                return "Not able to store the book";
            }
        }
        booksList.add(book);
        System.out.println(book + " is  inserted");
        return "Able to store the book";
    }

    public List<Book> getBooks() {
        return booksList;
    }

    public Book getBookById(long id) {
        for (Book books : booksList) {
            if (books.getId() == id) {
                return books;
            }
        }
        return null;
    }
}

