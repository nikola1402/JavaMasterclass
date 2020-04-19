package com.company;

/**
 * Created by nikol on 03-Dec-17.
 */
public class Bed {

    private boolean isNeat;
    private int pillows;
    private Blanket blanket;

    public Bed(boolean isNeat, int pillows, Blanket blanket) {
        this.isNeat = isNeat;
        this.pillows = pillows;
        this.blanket = blanket;
    }

    public void makeBed(){
        if(!isNeat) {
            isNeat = true;
            System.out.println("Tidying up the bed...");
        }

        if(!blanket.isFolded()){
            blanket.foldBlanket();
        }
        System.out.println("Bed is neat");
    }

    public boolean isNeat() {
        return isNeat;
    }

    public int getPillows() {
        return pillows;
    }

    public Blanket getBlanket() {
        return blanket;
    }
}
