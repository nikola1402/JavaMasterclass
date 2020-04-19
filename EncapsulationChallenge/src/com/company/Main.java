package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(24.0d, true);
        printer.fillToner();
        printer.fillToner();
        printer.printPage(10);
        printer.printPage(15);


        //TonerRefill newToner = new TonerRefill(30);
        printer.fillToner();
        printer.printPage(printer.getPagesLeftToPrint());
        printer.printPage(15);

    }
}
