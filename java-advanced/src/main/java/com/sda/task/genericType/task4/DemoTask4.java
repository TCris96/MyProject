package com.sda.task.genericType.task4;

public class DemoTask4 {
    public static void main(String[] args) {
        Library<Book> libraryOfBooks = new Library<>();
        Book book = new Book("Harry Potter","No",2005);
        libraryOfBooks.add(book);
        System.out.println(libraryOfBooks );
        Library<Newspaper> libraryOfNewspapers = new Library<>();
        Newspaper newspaper = new Newspaper("Adevarul",1950);
        libraryOfNewspapers.add(newspaper);
        System.out.println(libraryOfNewspapers);
        Library<Movie> libraryOfMovies = new Library<>();
        Movie movie = new Movie("Pride and Prejudice","ghn");
        libraryOfMovies.add(movie);
        System.out.println(libraryOfMovies);

    }
}
