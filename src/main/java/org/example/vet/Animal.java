package org.example.vet;

// Base class representing general biographical data about animals
public class Animal {
    private String name;
    private int age;
    private String species;
    private MedicalRecord medicalRecord;

    // Constructor to initialize basic animal data
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.medicalRecord = new MedicalRecord();
    }

    // Getters and setters for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    // Method to display animal data
    public void displayAnimalInfo() {
        System.out.println("Animal: " + name + " (Species: " + species + ", Age: " + age + ")");
        medicalRecord.displayMedicalHistory();
    }
}

