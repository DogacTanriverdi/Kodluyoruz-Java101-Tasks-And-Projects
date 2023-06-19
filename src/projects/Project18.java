package projects;

import java.util.Scanner;

public class Project18 {

    public static void main(String[] args) {

        // Create variables
        int n;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number of digits: ");
        n = input.nextInt();

        // Make a triangle with stars
        for (int i = 1; i <= n; i++) { // i
            for (int k = 1; k <= (n - i); k++) // (n - i)
                System.out.print(" ");
            for (int j = 1; j <= ((2 * i) - 1); j++) // (2i - 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
