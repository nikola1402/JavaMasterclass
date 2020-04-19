package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Contact contact = new Contact();

    public static void main(String[] args) {

        int choice = 0;
        boolean quit = false;

        while (!quit) {
            printOptions();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    showAllContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void showAllContacts(){

        ArrayList<Contact> allContacts = contact.findAllContacts();
        for(int i=0; i<allContacts.size(); i++){
            contact = allContacts.get(i);
            System.out.println("Contact #"+(i+1)+"\nName: " +contact.getName()+ "\nNumber: "+contact.getNumber());
        }
    }

    public static void addContact(){
        System.out.println("Insert contact name:");
        String name = scanner.nextLine();
        System.out.println("Insert contact number:");
        int number = scanner.nextInt();
        System.out.println(name+number);
        try {
            contact.addContact(name, number);
            System.out.println("Contact added");

        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public static void updateContact(){
        System.out.println("Insert contact number:");
        int number = scanner.nextInt();
        System.out.println("Insert new number:");
        int newNumber = scanner.nextInt();
        contact.updateContact(number, newNumber);
    }

    public static void removeContact(){
        System.out.println("Contact to remove: ");
        String name = scanner.nextLine();
        contact.removeContact(name);
    }

    public static void findContact(){
        System.out.println("Search for contact: ");
        String name = scanner.nextLine();
        contact = contact.findContact(name);
        if (contact == null){
            System.out.println("Can't find this contact.");
        } else {
            System.out.println("Contact found!"+"\nName: "+contact.getName()+"\nNumber: "+contact.getNumber());
        }
    }

    private static void printOptions(){
        System.out.println("Choose an option:");
        System.out.println("1 : Show all contacts");
        System.out.println("2 : Add new contact");
        System.out.println("3 : Update existing contact");
        System.out.println("4 : Remove contact");
        System.out.println("5 : Find contact by name");
    }

}

