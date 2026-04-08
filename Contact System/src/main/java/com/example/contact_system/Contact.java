package com.example.contact_system;

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public void printContact(){
        System.out.println(this.name + " " + this.phoneNumber + " " + this.email);
    }

    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.matches("[0-9]{10}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number");
        }
    }
    public void setEmail(String email){
        if (email.contains("@")){
            this.email = email;
        }
        else{
            System.out.println("Invalid Email");
        }
    }
    @Override
    public String toString(){
        return name + " " + phoneNumber + " " + email;
    }

}
