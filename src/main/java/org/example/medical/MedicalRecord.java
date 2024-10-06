package org.example.medical;

import java.util.List;
import java.util.ArrayList;

public class MedicalRecord {
    private List<String> history;

    // Constructor initializes an empty medical history
    public MedicalRecord() {
        history = new ArrayList<>();
    }

    // Method to add new medical entry
    public void addMedicalRecord(String entry) {
        history.add(entry);
    }

    // Method to display the medical history of the animal
    public void displayMedicalHistory() {
        System.out.println("Medical History:");
        for (String record : history) {
            System.out.println("- " + record);
        }
    }
}
