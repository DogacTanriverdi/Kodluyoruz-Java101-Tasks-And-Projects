package tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        // Create variables
        int n;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        n = input.nextInt();

        // Calculate powers of 4 and 5 that entered number
        for (int i = 1; i <= n; i *= 4)
            System.out.println("Powers of 4: " + i);
        for (int j = 1; j <= n; j *= 5)
            System.out.println("Powers of 5: " + j);
    }
}
