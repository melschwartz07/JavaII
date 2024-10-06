package org.example.bank;

import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {
        // Create a bank instance
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Example interaction: create a customer and open accounts
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.println("Enter customer address: ");
        String address = scanner.nextLine();

        System.out.println("Enter customer email: ");
        String email = scanner.nextLine();

        // Create a customer
        Customer customer = new Customer(name, address, email);
        bank.addCustomer(customer);

        // Open an account for the customer
        System.out.println("Opening an account for " + customer.getName());
        Account account1 = bank.openAccount(customer, 1000.0);

        // Perform some transactions
        System.out.println("Deposit 500 into account: " + account1.getAccountNumber());
        account1.deposit(500);

        System.out.println("Withdraw 200 from account: " + account1.getAccountNumber());
        account1.withdraw(200);

        // Display balance
        System.out.println("Current balance in account " + account1.getAccountNumber() + ": $" + account1.getBalance());

        // Open a second account and transfer funds
        Account account2 = bank.openAccount(customer, 500.0);
        System.out.println("Transferring 300 from account " + account1.getAccountNumber() + " to account " + account2.getAccountNumber());
        account1.transfer(account2, 300);

        // Display balances
        System.out.println("Current balance in account " + account1.getAccountNumber() + ": $" + account1.getBalance());
        System.out.println("Current balance in account " + account2.getAccountNumber() + ": $" + account2.getBalance());

        // Close scanner
        scanner.close();
    }
}

