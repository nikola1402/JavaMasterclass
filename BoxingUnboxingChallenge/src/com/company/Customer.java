package com.company;

import java.util.ArrayList;

/**
 * Created by nikol on 16-Dec-17.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(5.00);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
        System.out.println("Added transaction of " +transaction+ "$");
    }
}
