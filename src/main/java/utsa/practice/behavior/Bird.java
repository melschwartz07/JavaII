package utsa.practice.behavior;

// Subclass representing a bird
public class Bird extends Animals {
    // Override the move method to specify how a bird moves (flies)
    @Override
    public void move() {
        System.out.println("The bird flies.");
    }

    // Override the makeSound method to specify the sound a bird makes (chirps)
    @Override
    public void makeSound() {
        System.out.println("The bird chirps.");
    }
}

