package projects;

import java.util.Scanner;

public class RightTriangleAreaAndPerimeterCalculator {

    public static void main(String[] args) {

        // Create variables
        int a, b, c, perimeter, area;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter edge 1: ");
        a = input.nextInt();

        System.out.print("Enter edge 2: ");
        b = input.nextInt();

        System.out.print("Enter edge 3: ");
        c = input.nextInt();

        // Perimeter of triangle
        perimeter = (a + b + c);

        // Area of triangle
        area = ((a * b) / 2);

        // Show results
        System.out.println("Perimeter of triangle: " + perimeter);
        System.out.println("Area of triangle: " + area);
    }
}
