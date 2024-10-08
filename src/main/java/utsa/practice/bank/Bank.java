package utsa.practice.bank;

import java.util.ArrayList;
import java.util.List;

class Bank {
    // List of all customers in the bank
    private List<Customer> customers;

    // List of all accounts in the bank
    private List<Account> accounts;

    // Constructor initializes empty lists of customers and accounts
    public Bank() {
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    // Method to add a new customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to remove a customer and any related accounts
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        // Remove associated accounts from the bank's accounts
        accounts.removeAll(customer.getAccounts());
    }

    // Method to open a new account for a customer
    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(initialBalance);
        customer.addAccount(account);
        accounts.add(account);
        return account;
    }

    // Method to close an account and remove it from the customer
    public void closeAccount(Customer customer, Account account) {
        customer.removeAccount(account);
        accounts.remove(account);
    }
}

