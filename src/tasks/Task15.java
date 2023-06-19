package tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        // Variables
        int n, i, total = 0;

        // Define Scanner class
        Scanner inp = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        n = inp.nextInt();

        // Calculate perfect number
        /*
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                total += i;
        }
         */

        i = 1;
        while (i < n) {
            if (n % i == 0)
                total += i;
            i++;
        }

        if (total == n)
            System.out.println(n + " is a perfect number");
        else
            System.out.println(n + " is not a perfect number");

    }
}
