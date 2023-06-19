package projects;

import java.util.Scanner;

public class TaximeterCalculator {

    public static void main(String[] args) {

        // Create variables
        double km, perKm = 2.20, total, startPrice = 10;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the distance in KM: ");
        km = input.nextDouble();

        // Calculate price
        total = (km * perKm);
        total += startPrice;

        // The minimum amount to be paid should be 20 TL.
        total = (total < 20) ? 20 : total;

        // Show result
        System.out.println("Total price: " + total);
    }
}
