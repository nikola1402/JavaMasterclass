package com.company;

import javax.swing.plaf.ViewportUI;

public class Main {

    public static void main(String[] args) {

        bankAccount Acc = new bankAccount(123456789, 125.00, "John Doe", "email@example.com", 123-456);
        System.out.println("Account Created!");


        System.out.println("Current ballance: " +Acc.getBallance());
        Acc.depositFunds(Acc.getBallance(), 330.00);
        System.out.println("New ballance: " +Acc.getBallance());


        if(Acc.withdrawFunds(Acc.getBallance(), 105.00)) {
            System.out.println("Current ballance: " +Acc.getBallance());
        } else {
            System.out.println("Oops! Can't withdraw");
        }

        bankAccount timsAccount = new bankAccount("Tim", "tim@email.com", 123456);
        System.out.println(timsAccount.getPhoneNumber() + " name " + timsAccount.getName() + " account " +timsAccount.getAccountNumber());


        // TEST QUIZ
        System.out.println("***** TEST QUIZ *****");

        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer("Bob", 25000.00);
        System.out.println(vip2.getName());

        VipCustomer vip3 = new VipCustomer("Tim", 10.00, "vipmail@mail.com");
        System.out.println(vip3.getName());
    }
}
