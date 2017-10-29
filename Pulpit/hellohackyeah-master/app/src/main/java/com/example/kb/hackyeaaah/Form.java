package com.example.kb.hackyeaaah;

/**
 * Created by ela on 28.10.17.
 */

public class Form {
    public String name;
    public String surname;
    public String phoneNumber;
    //private EmailMessage email;
    public Address address;

    public Form(){}

    public Form(String name, String surname, String phoneNumber, Address address) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
       // this.email = email;
        this.address = address;
    }
}
