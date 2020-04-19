package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Bank bank = new Bank();
        boolean exit = true;
        int option = 0;
        String customerName, branchName;
        double transaction;

        System.out.println("Welcome to your bank");
        while(exit != false){
            printOptions();
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    bank.findAllBranches();
                    break;
                case 2:
                    branchName = scanner.nextLine();
                    bank.addBranch(branchName);
                    break;
                case 3:
                    branchName = scanner.nextLine();
                    customerName = scanner.nextLine();
                    System.out.println(branchName+customerName);
                    bank.addCustomerToBranch(branchName, customerName);
                    break;
                case 4:
                    branchName = scanner.nextLine();
                    customerName = scanner.nextLine();
                    transaction = scanner.nextDouble();
                    bank.addCustomerTransaction(branchName, customerName, transaction);
                    break;
                case 5:
                    branchName = scanner.nextLine();
                    bank.showBranchCustomers(branchName);
                    break;
                default:
                    exit = true;
                    break;
            }
        }


    }

    public static void printOptions(){
        System.out.println("Select an option:\n" +
                            "1 -> Show all branches.\n"+
                            "2 -> Add new branch.\n"+
                            "3 -> Add new customer.\n"+
                            "4 -> Add new transacton to customer\n"+
                            "5 -> Show all customers in branch.\n"+
                            "Press any other button to exit.");
    }
}
