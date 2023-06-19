package tasks;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        int base, exponent;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the base number: ");
        base = input.nextInt();

        System.out.print("Enter the exponent number: ");
        exponent = input.nextInt();

        // Calculate power number
        System.out.println(power(base, exponent));

    }

    static int power(int base, int exponent) {
        int result = 1;
        if (exponent == 0)
            return result;
        return result *= base * power(base, --exponent);
    }
}
