package tasks;

import java.util.Scanner;

public class GreengroserCashierProgram {

    public static void main(String[] args) {

        // Create variables
        String pear, apple, tomato, banana, eggplant;
        double pearPrice, applePrice, tomatoPrice, bananaPrice, eggplantPrice, totalPrice;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

        // Initialize products
        pear = "Pear";
        apple = "Apple";
        tomato = "Tomato";
        banana = "Banana";
        eggplant = "Eggplant";

        // Initialize prices
        pearPrice = 2.14;
        applePrice = 3.67;
        tomatoPrice = 1.11;
        bananaPrice = 0.95;
        eggplantPrice = 5.00;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print(pear + "How many kg? : ");
        pearKg = input.nextDouble();

        System.out.print(apple + "How many kg? : ");
        appleKg = input.nextDouble();

        System.out.print(tomato + "How many kg? : ");
        tomatoKg = input.nextDouble();

        System.out.print(banana + "How many kg? : ");
        bananaKg = input.nextDouble();

        System.out.print(eggplant + "How many kg? : ");
        eggplantKg = input.nextDouble();

        // Calculate price
        totalPrice = (
                (pearKg * pearPrice) +
                        (appleKg * applePrice) +
                        (tomatoKg * tomatoPrice) +
                        (bananaKg * bananaPrice) +
                        (eggplantKg * eggplantPrice)
        );

        // Show results
        System.out.println("Total price: " + totalPrice);
    }
}
