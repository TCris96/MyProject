package com.sda.io.collection.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Task5Stack {
    public static Stack<Book> transformIntoStack(Book ... books){
        Stack<Book> stackOfBooks = new Stack<>();
        List<Book> bookList = Arrays.stream(books).collect(Collectors.toList());
        Collections.sort(bookList,new ComparatorByPrice());
        for(Book book : bookList){
            stackOfBooks.push(book);
        }
        return stackOfBooks;

    }


}
