package tasks;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {

        // Create variables
        double height, weight, bodyMassIndex;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Please enter your height in meters (m): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight in kilograms (kg): ");
        weight = input.nextDouble();

        // Calculate body mass index
        bodyMassIndex = (weight / (height * height));

        // Show result
        System.out.println("Your body mass index: " + bodyMassIndex);
    }
}
