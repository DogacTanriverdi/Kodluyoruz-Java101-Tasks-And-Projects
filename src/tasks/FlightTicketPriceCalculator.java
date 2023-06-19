package tasks;

import java.util.Scanner;

public class FlightTicketPriceCalculator {

    public static void main(String[] args) {

        // Create variables
        int age;
        double distance, tripType, pricePerDistance = 0.10, totalPrice;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the distance in km: ");
        distance = input.nextDouble();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter type of your trip: ");
        tripType = input.nextDouble();

        // Check the accuracy of the information
        if (!((age >= 0) && (distance > 0) && ((tripType == 1) || (tripType == 2)))) {
            System.out.println("The information you entered is incorrect!");
        } else {
            // Calculate price
            totalPrice = (distance * pricePerDistance);

            // Calculate discounts
            if (age < 12) {
                totalPrice /= 2;
            } else if (age <= 24) {
                totalPrice *= 0.90;
            } else if (age >= 65) {
                totalPrice *= 0.70;
            }

            if (tripType == 2) {
                totalPrice *= 2;
                totalPrice *= 0.80;
            }

            // Show result
            System.out.println(totalPrice + " TL");
        }
    }
}
