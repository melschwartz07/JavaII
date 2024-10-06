package org.example.shape;

class Triangle {
    // Attributes for length and width (base and height) of the triangle
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the triangle (assuming it's a right triangle)
    public double getArea() {
        return 0.5 * length * width;
    }

    // Method to calculate the perimeter of the triangle (assuming right triangle using Pythagoras theorem)
    public double getPerimeter() {
        return length + width + Math.sqrt(length * length + width * width);
    }
}
