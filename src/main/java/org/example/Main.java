package org.example;

/**
 * processRemoval Method:
 * This is the main method that handles the removal process. It first validates the range using isValidRange, and if valid, proceeds to shift elements and then fills the trailing values with zeros. This separation ensures that each operation is handled by its own specialized method.
 * isValidRange Method:
 * This method checks if the given range (start and end indices) is within the bounds of the array. This improves clarity by isolating the validation logic from the main removal logic.
 * shiftElements Method:
 * This method is responsible for shifting the elements that come after the end index, moving them to the left to replace the removed elements. It isolates the element-moving logic from the rest of the functionality.
 * fillZeros Method:
 * This method takes care of filling the trailing positions in the array with zeros. It only deals with this responsibility, making the code modular and easier to maintain.
 * prnArr Method:
 * This method prints the array, separated from the core logic to ensure the display logic is independent of the other functions.
 */

public class Main {
    public static void main(String[] args) {
        // Test case 1
        int[] a = {4, 6, 8, 23, 15, 2};
        processRemoval(a, 3, 4); // Expected Output: 4, 6, 8, 2, 0, 0
        prnArr(a);

        // Test case 2
        int[] b = {4, 6, 8, 23, 15, 2};
        processRemoval(b, 2, 5); // Expected Output: 4, 6, 0, 0, 0, 0
        prnArr(b);

        // Test case 3
        int[] c = {4, 6, 8, 23, 15, 2};
        processRemoval(c, 2, 10); // Out of range, should print a message
        prnArr(c);
    }

    // This method orchestrates the removal process
    public static void processRemoval(int[] arr, int start, int end) {
        // Validate if indices are in a valid range
        if (!isValidRange(arr, start, end)) {
            System.out.println("Index out of range");
            return; // Exit if the range is invalid
        }

        // Perform the removal if the range is valid
        shiftElements(arr, start, end);

        // Set the trailing elements to zero after shifting
        fillZeros(arr, start, end);
    }

    // Validate if the start and end indices are valid
    public static boolean isValidRange(int[] arr, int start, int end) {
        return start >= 0 && end < arr.length && start <= end;
    }

    // Shift elements left to remove values between start and end
    public static void shiftElements(int[] arr, int start, int end) {
        for (int i = end + 1; i < arr.length; i++) {
            arr[start + i - (end + 1)] = arr[i]; // Move elements to overwrite removed range
        }
    }

    // Fill the remaining spaces with zero
    public static void fillZeros(int[] arr, int start, int end) {
        // Calculate where to start filling zeros
        int zeroStartPos = arr.length - (end - start + 1);

        // Set the trailing positions to zero
        for (int i = zeroStartPos; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    // Print the array
    public static void prnArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(); // Move to the next line after printing the array
    }
}

