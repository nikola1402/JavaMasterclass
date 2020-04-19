package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("Black", "Lamb");
        System.out.println("Total price for burger is: " + burger.getTotalPrice() + "$");

        burger.addPickle();
        burger.addCheese();
        burger.addLettuce();
        System.out.println("Total price for burger is: " + roundPrice(burger.getTotalPrice()) + "$");

        System.out.println("\n**********\n");

        HealthyBurger hBurger = new HealthyBurger("Lamb");
        hBurger.addOnion();
        hBurger.addCheese();
        System.out.println("Total price for burger is: " + roundPrice(hBurger.getTotalPrice()) + "$");

        System.out.println("\n**********\n");
        DeluxeBurger dBurger = new DeluxeBurger("White", "a", "Coca Cola");
        System.out.println("Total price for burger is: " + roundPrice(dBurger.getTotalPrice()) + "$");


    }


    private static double roundPrice(double price) {
        DecimalFormat f = new DecimalFormat("##.##");
        double newValue = Double.valueOf(f.format(price));
        return newValue;
    }
}

