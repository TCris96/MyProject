package com.sda.collection.comparator;

import java.util.Comparator;

public class TitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie one, Movie two) {
        return two.getTitle().compareTo(one.getTitle());
    }
}
