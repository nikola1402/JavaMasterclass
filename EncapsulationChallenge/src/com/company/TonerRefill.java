package com.company;

/**
 * Created by nikol on 03-Dec-17.
 */
public class TonerRefill {
    private double tonerRemaining;

    public TonerRefill(double tonerRemaining) {
        this.tonerRemaining = tonerRemaining;
    }



    public void setTonerRemaining(double tonerRemaining) {
        this.tonerRemaining = tonerRemaining;
    }

    public double getTonerRemaining() {
        return tonerRemaining;
    }
}
