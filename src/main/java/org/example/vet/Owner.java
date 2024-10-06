package org.example.vet;

// Class representing the owner of the animal
public class Owner {
    private String name;
    private String phoneNumber;
    private String email;
    private String paymentInfo;

    // Constructor to initialize owner details
    public Owner(String name, String phoneNumber, String email, String paymentInfo) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.paymentInfo = paymentInfo;
    }

    // Getters and setters for owner details
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    // Method to display owner data
    public void displayOwnerInfo() {
        System.out.println("Owner: " + name + " (Phone: " + phoneNumber + ", Email: " + email + ")");
    }
}

