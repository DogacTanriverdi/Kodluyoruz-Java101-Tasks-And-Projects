package tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        // Variables
        int number, counter, k, min = 999999999, max = 0;

        // Define Scanner class
        Scanner inp = new Scanner(System.in);

        // Get inputs from user
        System.out.print("How many numbers will you enter? ");
        counter = inp.nextInt();

        // Calculate minimum and maximum number
        k = 1;
        while (k <= counter) {
            System.out.print("Enter the " + k + ". number: ");
            number = inp.nextInt();
            if (number > max)
                max = number;
            if (number < min)
                min = number;
            k++;
        }

        // Show results
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
