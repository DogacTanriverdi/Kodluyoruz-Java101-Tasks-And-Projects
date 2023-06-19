package tasks;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        // Variables
        int n, total, a = 0, b = 1;

        // Define Scanner class
        Scanner inp = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the number of fibonacci series: ");
        n = inp.nextInt();

        // Calculate fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            total = a + b;
            a = b;
            b = total;
        }
    }
}
