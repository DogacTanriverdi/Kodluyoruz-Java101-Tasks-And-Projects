package tasks;

import java.util.Scanner;


public class Task11 {

    public static void main(String[] args) {

        // Create variables
        int number, tempNumber, valueOfDigits, numberOfDigits = 0, result = 0;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Calculate sum of digits of a number
        tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            valueOfDigits = tempNumber % 10;
            result += valueOfDigits;
            tempNumber /= 10;
        }
        System.out.println("Result: " + result);
    }
}
