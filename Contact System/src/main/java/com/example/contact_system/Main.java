package com.example.contact_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        System.out.println("How many contacts do you want to add?");
        int num = input.nextInt();
        input.nextLine();

        for (int i = 0; i < num; i++){
            System.out.println("\nContact " + (i+1));
            String name;
            String phone;
            String email;

            System.out.print("Enter name: ");
            name = input.nextLine();

            // Validation phone number

            while(true) {
                System.out.print("Enter phone number: ");
                phone = input.nextLine();

                if (phone.matches("[0-9]{10}")) {
                    break;
                } else {
                    System.out.println("Invalid phone number. Must be 10 digit numbers !");
                }
            }

            // Validation email

            while(true){
                System.out.print("Enter email: ");
                email = input.nextLine();

                if (email.contains("@")){
                    break;
                } else {
                    System.out.println("Invalid email address. Must contain @ !");
                }
            }

            Contact contact = new Contact(name, phone, email);
        }

        System.out.println("\n --- All Contacts ---");
        manager.printAllContacts();

        System.out.print("\nSearch for name: ");
        String searchName = input.nextLine();

        Contact found = manager.searchContactByName(searchName);

        if (found != null){
            System.out.println("Found: " + found);
        } else {
            System.out.println("Not Found");
        }
    }
}
