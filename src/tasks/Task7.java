package tasks;

import java.util.Scanner;

public class Task7 {

    /*
    A program that accepts input from the user
    until an odd number is entered and adds even and multiples of 4 from the entered values.
    */

    public static void main(String[] args) {

        // Create variables
        int n, total = 0;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user & Calculate numbers to dual and divisible by 4
        do {
            System.out.print("Enter a number: ");
            n = input.nextInt();
            if (n % 2 == 0)
                if (n % 4 == 0)
                    total += n;
        } while (n % 2 == 0);

        System.out.println("Total: " + total);
    }
}
