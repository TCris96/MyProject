package com.sda.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparator {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("movie2",5,2020);
        Movie movie2 = new Movie("movie1",2,2019);
        Movie movie3 = new Movie("movie3",4,2000);
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        for(Movie movie: movieList){
            System.out.println(movie);
        }
        Collections.sort(movieList,new RatingComparator());
        for(Movie movie: movieList){
            System.out.println(movie);
        }
        Collections.sort(movieList, new TitleComparator());
        for(Movie movie: movieList){
            System.out.println(movie);
        }


    }



}
