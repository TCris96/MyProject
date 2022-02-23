package com.sda.collection.comparator;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie one, Movie two) {
        return one.getRating() - two.getRating();
    }
}
