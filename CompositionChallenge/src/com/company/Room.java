package com.company;

/**
 * Created by nikol on 03-Dec-17.
 */
public class Room {

    private Door door;
    private Bed bed;

    public Room(Door door, Bed bed) {
        this.door = door;
        this.bed = bed;
    }


    public void tidyUpTheRoom(){
        bed.makeBed();
    }


    public Door getDoor() {
        return door;
    }

    public Bed getBed() {
        return bed;
    }
}
