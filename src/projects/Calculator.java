package projects;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Create variables
        int n1, n2, select;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");

        System.out.print("Your choice: ");
        select = input.nextInt();

        // Calculator
        switch (select) {
            case 1 -> System.out.println("Result: " + (n1 + n2));
            case 2 -> System.out.println("Result: " + (n1 - n2));
            case 3 -> System.out.println("Result: " + (n1 * n2));
            case 4 -> {
                if (!(n2 == 0)) {
                    System.out.println("Result: " + (n1 / n2));
                } else {
                    System.out.println("A number cannot be divided by 0");
                }
            }
            default -> System.out.println("Please enter a valid number! Try again.");
        }
    }
}
