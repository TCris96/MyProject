package com.sda.io.collection.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4CreateMap {
    public static Map<Genre,String> createAMapOfBooks(Book ... book){
       Map<Genre,String> booksStoredByGenre = new HashMap<>();
        List<Book> bookList = Arrays.stream(book).collect(Collectors.toList());
        for(Book books : bookList){
            booksStoredByGenre.put(books.getGenre(),books.getTitle());
        }
        return booksStoredByGenre;
    }

}
