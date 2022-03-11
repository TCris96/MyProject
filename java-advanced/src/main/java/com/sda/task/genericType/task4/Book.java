package com.sda.task.genericType.task4;

public class Book extends MediaContent {

    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        super(title);
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", title='" + title + '\'' +
                "} " + super.toString();
    }
}
