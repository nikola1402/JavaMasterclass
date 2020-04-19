package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by nikol on 16-Dec-17.
 */
public class Bank {

    private Branch branch;

    private ArrayList<Branch> branches = new ArrayList<>();

    public void addBranch(String branchName){
        this.branches.add(new Branch(branchName));
        System.out.println("Branch " +branchName+ " added.");
    }

    public void addCustomerToBranch(String branchName, String customerName){
        branch = findBranch(branchName);
        branch.addCustomer(customerName);
    }

    public void addCustomerTransaction(String branchName, String customerName, double transaction){
        branch = findBranch(branchName);
        branch.addTransaction(customerName, transaction);
    }

    public Branch findBranch(String branchName){
        for(int i=0; i<this.branches.size(); i++){
            branch = branches.get(i);
            if(branch.getName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public void findAllBranches(){
        for(int i=0; i<this.branches.size(); i++){
            System.out.println("Branch " +this.branches.get(i).getName());
        }
    }

    public void showBranchCustomers(String branchName){
        branch = findBranch(branchName);
        branch.showBranchCustomers();
    }



}
