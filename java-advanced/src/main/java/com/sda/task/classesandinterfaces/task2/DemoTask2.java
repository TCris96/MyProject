package com.sda.task.classesandinterfaces.task2;

public class DemoTask2 {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("Up")
                .setDirector("NO")
                .setGenre("Drama")
                .setDistributor("ana")
                .setYearOfRelease(2020)
                .createMovie();
        System.out.println(movie);
    }
}
