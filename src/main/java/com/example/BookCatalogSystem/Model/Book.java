/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Apr-21
 *   Time: 3:09 PM
 *   File: Book.java
 */

package com.example.BookCatalogSystem.Model;

import lombok.Getter;
import lombok.Setter;

@Getter // Aspect Oriented Programming
@Setter // Aspect Oriented programming
public class Book {
    private long id;
    private String authorName;
    private int cost;

    public Book(long id, String authorName, int cost) {
        this.id = id;
        this.authorName = authorName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}' + '\n';
    }
}

