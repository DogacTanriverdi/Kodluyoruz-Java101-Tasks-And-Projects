package projects;

import java.util.Scanner;

public class Project14 {
    public static void main(String[] args) {

        // Create variables
        int n;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        n = input.nextInt();

        // Calculate powers of 2 that entered number
        for (int i = 1; i <= n; i *= 2)
            System.out.println(i);
    }
}
