package projects;

import java.util.Scanner;

public class Project23 {

    public static void main(String[] args) {

        String menu = """
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Exponential number calculation
                6- Getting a mod
                7- Rectangular area and perimeter calculation
                0- Exit""";

        // Variables
        int n1, n2, select;

        // Define Scanner class
        Scanner inp = new Scanner(System.in);

        System.out.println(menu);
        while (true) {
            // Get inputs from user
            System.out.print("Select a transaction: ");
            select = inp.nextInt();

            System.out.print("Enter the first number: ");
            n1 = inp.nextInt();
            System.out.print("Enter the second number: ");
            n2 = inp.nextInt();

            // Make calculator
            switch (select) {
                case 1 -> sum(n1, n2);
                case 2 -> sub(n1, n2);
                case 3 -> System.out.println("Result: " + multiply(n1, n2));
                case 4 -> division(n1, n2);
                case 5 -> System.out.println("Result: " + power(n1, n2));
                case 6 -> mod(n1, n2);
                case 7 -> calculateRectangle(n1, n2);
                default -> System.out.println("You entered an invalid transaction!");
            }
        }
    }

    static int sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Result: " + result);
        return result;
    }

    static int sub(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Result: " + result);
        return result;
    }

    static int multiply(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    static int division(int n1, int n2) {
        if (n1 == 0) {
            System.out.println("The second number must be non-zero!");
            return 0;
        }
        int result = n1 / n2;
        System.out.println("Result: " + result);
        return result;
    }

    static int power(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        return result;
    }

    static int mod(int n1, int n2) {
        int result = n1 % n2;
        System.out.println("Result: " + result);
        return result;
    }

    static void calculateRectangle(int n1, int n2) {
        System.out.println("Perimeter: " + (2 * (n1 + n2)));
        System.out.println("Area: " + (n1 * n2));
    }
}
