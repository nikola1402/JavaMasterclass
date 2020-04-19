package com.company;

import java.util.ArrayList;

/**
 * Created by nikol on 13-Dec-17.
 */
public class Contact {

    private String name;
    private int number;

    private ArrayList<Contact> contacts = new ArrayList<>();

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Contact(){

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addContact(String name, int number){
        contacts.add(new Contact(name, number));
    }

    public ArrayList<Contact> findAllContacts(){
        return contacts;
    }

    public Contact findContact(String name){
        Contact contact;
        for (int i=0; i<contacts.size(); i++){
            contact = contacts.get(i);
            if(contact.getName() == name){
                return contact;
            }
        }
        return null;
    }

    public void updateContact(int num, int newNum){
        Contact contact;
        for(int i=0; i<contacts.size(); i++){
            contact = contacts.get(i);
            if(contact.getNumber() == num){
                contact.setNumber(newNum);
                System.out.println("Contact updated!");
            }
        }
    }

    public void removeContact(String name){
        Contact contact = findContact(name);
        contacts.remove(contact);
        System.out.println("Contact removed!");

    }
}
