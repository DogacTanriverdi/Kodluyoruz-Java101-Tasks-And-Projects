package projects;

import java.util.Scanner;

public class CircleAreaAndPerimeterCalculator {

    public static void main(String[] args) {

        // Create variables
        int r;
        double pi = 3.14;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the radius of the circle: ");
        r = input.nextInt();

        // Calculate area and perimeter of the circle
        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
