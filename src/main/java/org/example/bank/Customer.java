package org.example.bank;

import java.util.List;
import java.util.ArrayList;

public class Customer {
    // Customer details
    private String name;
    private String address;
    private String email;

    // List of accounts owned by the customer
    private List<Account> accounts;

    // Constructor to initialize customer details
    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    // Getter and setter methods for personal details
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to remove an account from the customer
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Getter for the list of accounts
    public List<Account> getAccounts() {
        return accounts;
    }
}


