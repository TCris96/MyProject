package com.sda.io.collection.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public void display() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> findByGenre(Genre genre) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public List<Book> findByYear(int year) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublication() < year) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public Book theMostExpensiveBook() {
        Book theBook = null;
        for (Book book : books) {
            if (theBook == null || book.getPrice() > theBook.getPrice()) {
               theBook = book;
            }
        }
        return theBook;
    }

    public Book theCheapestBook() {
        Book theBook = null;
        for (Book book : books) {
            if (theBook == null || theBook.getPrice()> book.getPrice()) {
               theBook = book;
            }
        }
        return theBook;
    }

    public List<Book> bookWrittenBy3Authors(int numberOfAuthors) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().size() == numberOfAuthors) {
               result.add(book);
            }
        }
        return result;
    }

    public List<Book> ascendingSort() {
        Collections.sort(books, new BookComparator());
        return books;
    }

    public List<Book> descendingSort() {

       Collections.reverse(books);

        return books;
    }

    public void verifyTheExistenceOfTheBook(Book book) {
        for (Book bookFromArray : books) {
            if (bookFromArray.equals(book) == true) {
                System.out.println("The book " + book.getTitle() + " exist in the list");
            } else {
                System.out.println("The book " + book.getTitle() + "  does not exist in the list");
            }
        }
    }
    public List<Book> booksByTheAuthor(Author author){
        List<Book> listOfBooksByTheAuthor = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthors().contains(author)){
                listOfBooksByTheAuthor.add(book);
            }
        }
        return listOfBooksByTheAuthor;
    }

}
