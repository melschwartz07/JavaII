package org.example;

import java.util.ArrayList;
import java.util.List;

class Account {
    // Unique identifier for the account
    private static int nextAccountNumber = 1;
    private int accountNumber;

    // Current balance of the account
    private double balance;

    // List of owners (customers) for this account
    private List<Customer> owners;

    // Constructor initializes the account with an initial balance and no owners
    public Account(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
        this.owners = new ArrayList<>();
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to add a customer as an owner of the account
    public void addOwner(Customer customer) {
        if (!owners.contains(customer)) {
            owners.add(customer);
        }
    }

    // Method to get the list of account owners
    public List<Customer> getOwners() {
        return owners;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to transfer funds between two accounts
    public void transfer(Account targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        }
    }

    // Method to display the owners of the account
    public void displayOwners() {
        System.out.println("Account Number: " + accountNumber + " has the following owners:");
        for (Customer owner : owners) {
            System.out.println("- " + owner.getName());
        }
    }
}


