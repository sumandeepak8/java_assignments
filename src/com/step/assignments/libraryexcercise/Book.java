package com.step.assignments.libraryexcercise;

public class Book {
    private String bookName;
    private int isbn;

    public Book(String name, int isbn) {
        this.bookName = name;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public int getIsbn() {
        return isbn;
    }
}
