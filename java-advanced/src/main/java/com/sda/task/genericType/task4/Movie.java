package com.sda.task.genericType.task4;

public class Movie extends MediaContent{

    private String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                "} " + super.toString();
    }
}
