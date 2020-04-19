package com.company;

import java.util.ArrayList;

/**
 * Created by nikol on 16-Dec-17.
 */
public class Branch {

    Customer customer;

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(String customerName){
        if(findCustomer(customerName) == null){
            System.out.println("Adding new customer...");
            this.customers.add(new Customer(customerName));
            System.out.println("Customer " +customerName+ " added.");
        } else {
            System.out.println("Customer already exists.");
        }
    }

    public void addTransaction(String customerName, double transaction){
        customer = findCustomer(customerName);
        customer.addTransaction(transaction);
    }

    public Customer findCustomer(String name){
        for(int i=0; i<this.customers.size(); i++){
            customer = this.customers.get(i);
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }

    public void showBranchCustomers(){
        for (int i=0; i<this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            System.out.println("Customer " + customer.getName() +"\nTransactions:");
            ArrayList<Double> transactions = customer.getTransactions();
            for (int j=0; j<transactions.size(); j++){
                System.out.println("#" +(j+1)+ ": " +transactions.get(j));
            }
        }
    }



}
