package tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        // Create variables
        int n, k, total = 1;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.print("Enter a number to be the exponent: ");
        k = input.nextInt();

        // Calculate power number
        for (int i = 1; i <= k; i++)
            total *= n;
        System.out.println("Result: " + total);
    }
}
