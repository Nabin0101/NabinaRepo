package com.nextstep.demo.basic;

public class FunctionOverloading {

   public static double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    // Function to calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        // Example usage
        double circleArea = calculateArea(5);
        System.out.println("Area of circle: " + circleArea);

        double rectangleArea = calculateArea(8, 3);
        System.out.println("Area of rectangle: " + rectangleArea);

    }
}

