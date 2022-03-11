package com.sda.task.exceptions.task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public BookRepository(){

    }

    public void add(Book book){
        books.add(book);
    }
    public void remove(Book book){
        books.remove(book);
    }
    public Book findByTitle(String title) throws NoBookFoundException{
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        throw new NoBookFoundException("The book does not exist");
    }
    public Book findById(int id){
        for(Book book : books){
            if(book.getId() == id){
                return book;
            }
        }
        throw new NoBookFoundException("The book does not exist");
    }
    public void removeById(int id)throws NoBookFoundException{
        for(Book book : books){
            if(book.getId() == id){
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("The does not exist");
    }

    @Override
    public String toString() {
        return "BookRepository" + books;

    }
}
