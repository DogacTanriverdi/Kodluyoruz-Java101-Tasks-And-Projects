package tasks;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        // Variables
        int numberOfDigits;

        // Define Scanner class
        Scanner inp = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the number of digits: ");
        numberOfDigits = inp.nextInt();

        // Make triangle with stars
        for (int i = numberOfDigits; i >= 1; i--) {
            for (int k = 1; k <= (numberOfDigits - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= ((i * 2) - 1); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
