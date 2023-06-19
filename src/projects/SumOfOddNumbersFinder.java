package projects;

import java.util.Scanner;

public class SumOfOddNumbersFinder {

    public static void main(String[] args) {

        // Create variables
        int n, total = 0;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        do {
            System.out.print("Enter a number: ");
            n = input.nextInt();
            if (n % 2 == 1)
                total += n;
        } while (n > 0);

        System.out.println("Total: " + total);

        // Calculate sum of odd numbers
    }
}