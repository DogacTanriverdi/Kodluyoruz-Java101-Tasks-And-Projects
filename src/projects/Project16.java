package projects;

import java.util.Scanner;


public class Project16 {

    public static void main(String[] args) {

        // Create variables
        int number, tempNumber, valueOfDigits, powerOfDigits, numberOfDigits = 0, result = 0;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (!((number >= 100) && (number <= 999)))
                System.out.println("Please enter a 3 digit number!");
        } while (!((number >= 100) && (number <= 999)));


        // Find armstrong numbers
        tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            valueOfDigits = tempNumber % 10;
            powerOfDigits = 1;
            for (int i = 1; i <= numberOfDigits; i++) {
                powerOfDigits *= valueOfDigits;
            }
            result += powerOfDigits;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is a armstrong number.");
        } else {
            System.out.println(number + " is not a armstrong number!");
        }
    }
}
