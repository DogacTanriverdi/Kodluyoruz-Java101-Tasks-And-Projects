package projects;

import java.util.Scanner;

public class RightTriangleHypotenuseCalculator {

    public static void main(String[] args) {

        // Create variables
        int a, b;
        double c;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter edge 1: ");
        a = input.nextInt();

        System.out.print("Enter edge 2: ");
        b = input.nextInt();

        // Calculate hypnotenuse
        c = Math.sqrt((a * a) + (b * b));

        // Show result
        System.out.println("Hypotenuse: " + c);
    }
}
