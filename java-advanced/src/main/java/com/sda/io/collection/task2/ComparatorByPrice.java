package com.sda.io.collection.task2;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return (int) (book2.getPrice()-book1.getPrice());
    }
}
