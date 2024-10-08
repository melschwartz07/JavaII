package utsa.practice.behavior;

// Subclass representing a panthera (could be a lion, tiger, etc.)
public class Panthera extends Animals {
    // Override the move method to specify how a panthera moves (runs or stalks)
    @Override
    public void move() {
        System.out.println("The panthera prowls stealthily.");
    }

    // Override the makeSound method to specify the sound a panthera makes (roars)
    @Override
    public void makeSound() {
        System.out.println("The panthera roars.");
    }
}

