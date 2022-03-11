package com.sda.io.collection.task2;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private float price;
    private int yearOfPublication;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, float price, int yearOfPublication,List<Author> author,Genre genre){
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.authors = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Float.compare(book.price, price) == 0 &&
                yearOfPublication == book.yearOfPublication &&
                Objects.equals(title, book.title) &&
                Objects.equals(authors, book.authors) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfPublication, authors, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }
}
