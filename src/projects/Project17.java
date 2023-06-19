package projects;

import java.util.Scanner;


public class Project17 {

    public static void main(String[] args) {

        // Create variables
        int n;
        double result = 0;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the n number: ");
        n = input.nextInt();

        // Find harmonic number
        for (int i = 1; i <= n; i++) {
            result += (1d / i);
        }

        // Show result
        System.out.println("Result: " + result);
    }
}
