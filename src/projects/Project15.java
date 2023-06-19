package projects;

import java.util.Scanner;

public class Project15 {

    public static void main(String[] args) {

        // Create variables
        int n, total = 1;

        // Define scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("--- For Loop ---");

        // Get input from user
        System.out.print("Enter a number: ");
        n = input.nextInt();

        // Calculate factorial in for loop

        for (int i = 1; i <= n; i++)
            total *= i;

        System.out.println(n + "! = " + total);

        System.out.println("--- While Loop ---");

        // Calculate factorial in while loop
        System.out.print("Enter a number: ");
        n = input.nextInt();

        int i = 1, total2 = 1;
        while (i <= n) {
            total2 *= i;
            i++;
        }
        System.out.println(n + "! = " + total2);
    }
}
