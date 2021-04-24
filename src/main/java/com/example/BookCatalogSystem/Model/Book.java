/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Apr-21
 *   Time: 3:09 PM
 *   File: Book.java
 */

package com.example.BookCatalogSystem.Model;

public class Book {
    private long id;
    private String name;
    private int cost;

    public Book(long id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}

