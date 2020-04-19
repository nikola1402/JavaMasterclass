package com.company;

/**
 * Created by nikol on 03-Dec-17.
 */
public class Blanket {

    private boolean isFolded;
    private int length;
    private int width;

    public Blanket(boolean isFolded, int length, int width) {
        this.isFolded = isFolded;
        this.length = length;
        this.width = width;
    }

    public void foldBlanket(){
        if(!isFolded){
            isFolded = true;
            System.out.println("Folding blanket...");
        }

        System.out.println("Blanket is folded");
    }


    public boolean isFolded() {
        return isFolded;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
