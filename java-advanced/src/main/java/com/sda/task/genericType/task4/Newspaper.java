package com.sda.task.genericType.task4;

public class Newspaper extends MediaContent {

    private int yearOfRelease;

    public Newspaper(String title, int yearOfRelease) {
        super(title);
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                "} " + super.toString();
    }
}
