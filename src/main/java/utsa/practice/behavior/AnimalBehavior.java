package utsa.practice.behavior;

// Driver class to test animal behavior
public class AnimalBehavior {
    public static void main(String[] args) {
        // Create a bird and panthera object
        Animals bird = new Bird();
        Animals panthera = new Panthera();

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

