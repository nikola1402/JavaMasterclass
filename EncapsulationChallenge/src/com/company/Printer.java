package com.company;

/**
 * Created by nikol on 03-Dec-17.
 */
public class Printer {

    private double tonerLvl;
    private int pagesPrinted;
    private boolean isDuplex;
    private int pagesLeftToPrint;
    private TonerRefill tonerRefill = new TonerRefill(100.0d);

    public Printer(double tonerLvl, boolean isDuplex) {
        if(tonerLvl > -1 && tonerLvl <= 100){
            this.tonerLvl = tonerLvl;
        }else{
            this.tonerLvl = 1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public void fillToner(){

        double tonerRemaining = tonerRefill.getTonerRemaining();

        if(tonerLvl == 100.0d){
            System.out.println("Toner level is already at 100%");
        } else {
            while(tonerLvl < 100.0d && tonerRemaining > 0.0d){
                tonerLvl++;
                tonerRemaining--;
            }
            tonerRefill.setTonerRemaining(tonerRemaining);
            System.out.println("Toner is filled to " +tonerLvl+"%. Remaining toner refill is at " +tonerRemaining+"%");
        }
    }




    public void printPage(int printPages){

        if(isDuplex) {
            System.out.println("Duplex printer printing...");
        }

        System.out.println("Printing "+printPages+" pages...");
        int j = printPages;

        for(int i = j; i>0; i--){
            if(tonerLvl > 0) {
                this.pagesPrinted++;
                printPages--;
                tonerLvl--;
            }
        }

        pagesLeftToPrint = printPages;

        if(pagesLeftToPrint > 0) {
            System.out.println("Please refill your toner!");
            System.out.println("Pages left to be printed: "+pagesLeftToPrint);

        }

        System.out.println("Total number of pages printed: "+pagesPrinted);
        System.out.println("Toner remaining in printer: " +tonerLvl);
    }

    public double getTonerLvl() {
        return tonerLvl;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getPagesLeftToPrint() {
        return pagesLeftToPrint;
    }


}
