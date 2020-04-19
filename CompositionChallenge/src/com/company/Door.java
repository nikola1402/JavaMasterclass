package com.company;

/**
 * Created by nikol on 03-Dec-17.
 */
public class Door {

    private int height;
    private int width;
    private boolean isClosed;

    public Door(int height, int width, boolean isClosed) {
        this.height = height;
        this.width = width;
        this.isClosed = isClosed;
    }

    public void closeTheDoor(){
        if(!isClosed){
            isClosed = true;
            System.out.println("Closing the door...");
        }

        System.out.println("The door is closed");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isClosed() {
        return isClosed;
    }
}
