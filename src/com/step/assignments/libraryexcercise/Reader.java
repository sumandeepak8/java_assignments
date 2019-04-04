package com.step.assignments.libraryexcercise;

import java.util.HashSet;
import java.util.Set;

public class Reader {

    private String name;
    private Set<Book> books;

    public Reader(String name) {
        this.books = new HashSet<>();
        this.name = name;
    }

    Set getBooks(){
        return this.books;
    }

}
