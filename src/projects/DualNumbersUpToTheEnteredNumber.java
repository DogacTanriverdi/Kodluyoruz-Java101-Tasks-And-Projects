package projects;

import java.util.Scanner;

public class DualNumbersUpToTheEnteredNumber {

    public static void main(String[] args) {

        // Create variables
        int n;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.println("\n--- For Loop ---");

        // Calculate dual numbers using for loop
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("\n--- While Loop ---");

        // Calculate dual numbers using while loop
        int i = 1;
        System.out.print("Enter a number: ");
        n = input.nextInt();
        while (i <= n) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }
}