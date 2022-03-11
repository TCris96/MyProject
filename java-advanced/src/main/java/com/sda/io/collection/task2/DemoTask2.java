package com.sda.io.collection.task2;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class DemoTask2 {
    public static void main(String[] args) {
        Author author1 = new Author("Jane" ,"Austin","F");
        Author author2 = new Author("Mihai" ,"Eminescu","M");
        Author author3 = new Author("Agatha" ,"Christie","F");
        Author author4 = new Author("Roger" ,"Moore","M");
        Book book1 = new Book("Book3",40,2005, Arrays.asList(author1),Genre.CRIME);
        Book book2 = new Book("Book2",50,1996,Arrays.asList(author3,author4),Genre.ACTION);
        BookService bookService = new BookService();
        bookService.add(book1);
        bookService.add(book2);
        //System.out.println(bookService.booksByTheAuthor(author3));
        bookService.display();
        bookService.ascendingSort();
        bookService.display();
        System.out.println(bookService.findByGenre(Genre.CRIME));
        Map<Genre,String> map = Task4CreateMap.createAMapOfBooks(book1,book2);
        System.out.println(map);
        Stack<Book> bookStack = Task5Stack.transformIntoStack(book1, book2);
        System.out.println(bookStack);


    }
}
