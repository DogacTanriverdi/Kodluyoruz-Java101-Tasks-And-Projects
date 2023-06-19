package tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        // Create variables
        int n;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number of digits: ");
        n = input.nextInt();

        // Make a diamond with stars
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= ((2 * i) - 1); j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = n; i >= 0; i--) {
            for (int k = (n - i); k > 0; k--)
                System.out.print(" ");
            for (int j = ((2 * i) - 1); j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
