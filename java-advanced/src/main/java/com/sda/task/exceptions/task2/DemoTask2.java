package com.sda.task.exceptions.task2;

public class DemoTask2 {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Book1","Author1",2015);
        Book book2 = new Book(2,"Book2","Author2",2015);
        BookRepository repository = new BookRepository();
        repository.add(book1);
        repository.add(book2);
        System.out.println(repository);
        Book result = repository.findByTitle("Book2");
        System.out.println(result);
        repository.removeById(3);
    }
}
