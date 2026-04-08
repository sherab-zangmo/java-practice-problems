package com.example.contact_system;

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void printAllContacts(){
        for(Contact contact : contacts){
            System.out.println(contact);
        }
    }

    public Contact searchContactByName(String name){
        for(Contact contact : contacts){
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}
