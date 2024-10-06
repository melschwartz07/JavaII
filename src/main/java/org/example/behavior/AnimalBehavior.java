package org.example.behavior;

// Driver class to test animal behavior
public class AnimalBehavior {
    public static void main(String[] args) {
        // Create a bird and panthera object
        Animal bird = new Bird();
        Animal panthera = new Panthera();

        // Call move and makeSound methods on bird
        System.out.println("Bird:");
        bird.move();        // Expected output: The bird flies.
        bird.makeSound();   // Expected output: The bird chirps.

        // Call move and makeSound methods on panthera
        System.out.println("\nPanthera:");
        panthera.move();     // Expected output: The panthera prowls stealthily.
        panthera.makeSound(); // Expected output: The panthera roars.
    }
}

