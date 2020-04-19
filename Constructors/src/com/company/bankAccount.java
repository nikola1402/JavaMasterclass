package com.company;

/**
 * Created by nikol on 02-Dec-17.
 */
public class bankAccount {

    private int accountNumber;
    private double ballance;
    private String name;
    private String email;
    private int phoneNumber;


    public bankAccount(int accountNumber, double ballance, String name, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.ballance = ballance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public bankAccount(String name, String email, int phoneNumber) {
        this(99999, 100.55, name, email, phoneNumber);
    }

    public double depositFunds(double ballance, double ammountDeposited){

        this.ballance += ammountDeposited;
        System.out.println("Money ammount deposited: " +ammountDeposited);
        return ballance;
    }

    public boolean withdrawFunds(double ballance, double ammountWithdrawn){

        if (this.ballance - ammountWithdrawn < 0) {
            System.out.println("Insufficient funds!");
            return false;
        }

        this.ballance -= ammountWithdrawn;
        System.out.println("Money ammount withdrawn: " +ammountWithdrawn);
        return true;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
