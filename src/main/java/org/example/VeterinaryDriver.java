package org.example;

import java.util.Scanner;

public class VeterinaryDriver {
    public static void main(String[] args) {
        // Create an instance of VeterinaryClinic
        VeterinaryClinic clinic = new VeterinaryClinic();
        Scanner scanner = new Scanner(System.in);

        // Example: Adding an owner
        System.out.println("Enter owner name:");
        String ownerName = scanner.nextLine();
        System.out.println("Enter owner phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter owner email:");
        String email = scanner.nextLine();
        System.out.println("Enter payment information:");
        String paymentInfo = scanner.nextLine();

        // Create owner and add to clinic
        Owner owner = new Owner(ownerName, phoneNumber, email, paymentInfo);
        clinic.addOwner(owner);

        // Example: Adding an animal
        System.out.println("Enter animal type (dog, cat, bird):");
        String animalType = scanner.nextLine();
        System.out.println("Enter animal name:");
        String animalName = scanner.nextLine();
        System.out.println("Enter animal age:");
        int animalAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Animal animal;
        if (animalType.equalsIgnoreCase("dog")) {
            animal = new Dog(animalName, animalAge);
        } else if (animalType.equalsIgnoreCase("cat")) {
            animal = new Cat(animalName, animalAge);
        } else {
            animal = new Bird(animalName, animalAge);
        }

        // Add animal to the clinic
        clinic.addAnimal(animal);

        // Add a medical record to the animal
        System.out.println("Enter a medical record for the animal:");
        String medicalRecord = scanner.nextLine();
        animal.getMedicalRecord().addMedicalRecord(medicalRecord);

        // Display clinic data
        clinic.displayAllData();

        // Close the scanner
        scanner.close();
    }
}

