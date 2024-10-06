package org.example;

// Class representing the veterinary clinic
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> animals;
    private List<Owner> owners;

    // Constructor initializes empty lists of animals and owners
    public VeterinaryClinic() {
        animals = new ArrayList<>();
        owners = new ArrayList<>();
    }

    // Method to add a new animal to the clinic
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Method to add a new owner
    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    // Method to display all animals and their owners
    public void displayAllData() {
        System.out.println("Clinic Data:");
        for (Animal animal : animals) {
            animal.displayAnimalInfo();
        }
        for (Owner owner : owners) {
            owner.displayOwnerInfo();
        }
    }
}

