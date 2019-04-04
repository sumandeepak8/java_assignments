package com.step.assignments.libraryexcercise;

import java.util.*;

public class Library {

    private List<Book> availableBooks;
    private List<Book> issuedBooks;
    private List<Book> totalBooks;
    private HashMap<String, Reader> readers;
    private Librarian librarian;
    private int readersCounter;

    public Library() {
        this.availableBooks = new ArrayList<>();
        this.issuedBooks = new ArrayList<>();
        this.totalBooks = new ArrayList<>();
        this.readers = new HashMap<>();
        this.librarian = new Librarian();
        this.readersCounter = 0;
    }

    List getAvailableBooks(){
        return this.availableBooks;
    }

    HashMap getAllReaders(){
        return this.readers;
    }

    Librarian getLibrarian(){
        return this.librarian;
    }

    private Library getLibrary(){
        return this;
    }

    boolean searchBook(String name){
        for (int i = 0; i < this.availableBooks.size(); i++) {
            if(this.availableBooks.get(i).getBookName() == name){
                return true;
            }

        }
        return false;
    }


    class Librarian{

        void addBook(Book book){
           Library library = getLibrary();
           library.availableBooks.add(book);
           library.totalBooks.add(book);
        }

        void addReader(String name){
            Library library = getLibrary();
            Reader reader = new Reader(name);
            library.readers.put(name,reader);
        }

        Reader getReader(String readerName,Library library){
            return (Reader) library.getAllReaders().get(readerName);
        }

        void removeBookFromLibrary(Book book){
            Library library = getLibrary();
            library.availableBooks.remove(book);
            library.totalBooks.remove(book);
            library.issuedBooks.remove(book);
        }

        void lendBook(String bookName, String readerName){
            Library library = getLibrary();
            Reader reader = this.getReader(readerName,library);
            for (int i = 0; i <library.availableBooks.size(); i++) {
                if(library.availableBooks.get(i).getBookName() == bookName) {
                    Book book = library.availableBooks.remove(i);
                    library.issuedBooks.add(book);
                    reader.getBooks().add(book);
                }

            }
        }

        String searchWhoHasThisBook(String book){
            Library library = new Library();
            HashMap<String,Reader> readers = library.getAllReaders();
            for (int i = 0; i < readers.size() ; i++) {
//                if(readers.get().getBooks().contains(book))

            }

        }

    }

}
