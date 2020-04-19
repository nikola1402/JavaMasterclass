package com.company;

/**
 * Created by nikol on 17-Dec-17.
 */
public class Song {

    private String name;
    private double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }
}
