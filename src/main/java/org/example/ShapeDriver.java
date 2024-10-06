package org.example;
import java.util.Scanner;

/**
 * Shape Classes (Circle, Triangle, Rectangle):
 *
 * Each class has attributes specific to the shape, e.g., radius for Circle, length and width for Triangle and Rectangle.
 * Each class has methods to calculate the area and perimeter of the shape.
 * The constructors initialize the attributes, and there are getters and setters to access and modify the attributes.
 * Driver Class (ShapeDriver):
 *
 * The program starts by creating a Scanner object to read user input.
 * A loop continually prompts the user to input a shape type or 'exit' to stop.
 * Depending on the shape type, it asks for the appropriate dimensions (e.g., radius, length, and width) and creates an instance of the corresponding shape.
 * It then calculates and prints the area and perimeter of the shape and keeps track of the total count, area, and perimeter for each type of shape.
 * When the user exits, it prints a summary of the total number of each type of shape entered, along with the total area and perimeter for each.
 * Scanner Input Management:
 *
 * After each shape entry, the buffer is cleared with scanner.nextLine() to ensure the program handles the next input correctly.
 * The program handles invalid inputs by printing an error message if the shape type is not recognized.
 */
public class ShapeDriver {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Variables to keep count and total areas and perimeters for each shape type
        int circleCount = 0, triangleCount = 0, rectangleCount = 0;
        double totalCircleArea = 0, totalCirclePerimeter = 0;
        double totalTriangleArea = 0, totalTrianglePerimeter = 0;
        double totalRectangleArea = 0, totalRectanglePerimeter = 0;

        // Main loop to continually prompt user for input
        while (true) {
            System.out.println("Enter a shape type (circle, triangle, rectangle) or 'exit' to stop:");
            String shapeType = scanner.nextLine().toLowerCase();

            // Exit the loop if the user inputs 'exit'
            if (shapeType.equals("exit")) {
                break;
            }

            switch (shapeType) {
                case "circle":
                    // Prompt for the radius and create a Circle object
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);

                    // Print the area and perimeter
                    System.out.println("Area of Circle: " + circle.getArea());
                    System.out.println("Perimeter (Circumference) of Circle: " + circle.getPerimeter());

                    // Update totals and count
                    circleCount++;
                    totalCircleArea += circle.getArea();
                    totalCirclePerimeter += circle.getPerimeter();
                    break;

                case "triangle":
                    // Prompt for the length and width (base and height) and create a Triangle object
                    System.out.print("Enter the length (base) of the triangle: ");
                    double triLength = scanner.nextDouble();
                    System.out.print("Enter the width (height) of the triangle: ");
                    double triWidth = scanner.nextDouble();
                    Triangle triangle = new Triangle(triLength, triWidth);

                    // Print the area and perimeter
                    System.out.println("Area of Triangle: " + triangle.getArea());
                    System.out.println("Perimeter of Triangle: " + triangle.getPerimeter());

                    // Update totals and count
                    triangleCount++;
                    totalTriangleArea += triangle.getArea();
                    totalTrianglePerimeter += triangle.getPerimeter();
                    break;

                case "rectangle":
                    // Prompt for the length and width and create a Rectangle object
                    System.out.print("Enter the length of the rectangle: ");
                    double recLength = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double recWidth = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(recLength, recWidth);

                    // Print the area and perimeter
                    System.out.println("Area of Rectangle: " + rectangle.getArea());
                    System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());

                    // Update totals and count
                    rectangleCount++;
                    totalRectangleArea += rectangle.getArea();
                    totalRectanglePerimeter += rectangle.getPerimeter();
                    break;

                default:
                    // Handle invalid shape type input
                    System.out.println("Invalid shape type. Please enter 'circle', 'triangle', or 'rectangle'.");
            }

            // Clear the scanner buffer
            scanner.nextLine();
        }

        // Print summary of shapes entered
        System.out.println("\nSummary of Shapes Entered:");
        System.out.println("Circles: " + circleCount + " | Total Area: " + totalCircleArea + " | Total Perimeter: " + totalCirclePerimeter);
        System.out.println("Triangles: " + triangleCount + " | Total Area: " + totalTriangleArea + " | Total Perimeter: " + totalTrianglePerimeter);
        System.out.println("Rectangles: " + rectangleCount + " | Total Area: " + totalRectangleArea + " | Total Perimeter: " + totalRectanglePerimeter);

        // Close the scanner
        scanner.close();
    }
}

