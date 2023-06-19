package tasks;

import java.util.Scanner;

public class DivisibleNumbersBy3And4 {

    public static void main(String[] args) {

        // Create Variables
        int number;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Calculate number to divisible by 3 and 4
        for (int i = 0; i <= number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0))
                System.out.println(i);
        }
    }
}