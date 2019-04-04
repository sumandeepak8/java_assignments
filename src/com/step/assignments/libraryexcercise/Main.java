package com.step.assignments.libraryexcercise;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Power of  habit", 1);
        Book book2 = new Book("atomic habits",2);
        Book book3 = new Book("Open", 3);
        Book book4= new Book("Dehli is not so far", 4);
        Book book5 = new Book("Tesla",5);

        Library.Librarian librarian = library.getLibrarian();  // getting librarian

        librarian.addBook(book1);     // adding books to library
        librarian.addBook(book2);
        librarian.addBook(book3);
        librarian.addBook(book4);
        librarian.addBook(book5);

        librarian.addReader("suman");       // adding reader to library
        librarian.addReader("srushti");       // adding reader to library

//        System.out.println(library.getAvailableBooks().size());       // total available books in library.
//        System.out.println(library.getAllReaders().size());
//        librarian.lendBook( "atomic habits","suman");
//        System.out.println(library.searchBook("atomic habit") + " it should print true ");
//        librarian.removeBookFromLibrary(book1);
//        System.out.println(library.getAvailableBooks().size() + " after deleting fro ");       // total number of books available will be 4
//        librarian.lendBook("atomic habits", "suman");
//        System.out.println( library.getAvailableBooks().size()+"  "  + " lend book");
//        System.out.println(library.searchBook("atomic habits") + " searching");

    }

}
