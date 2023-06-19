package projects;

import java.util.Scanner;

public class Project20 {

    public static void main(String[] args) {

        // Variables
        int n1, n2, ebob = 1, ekok = 1;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        // Calculate EBOB
        for (int i = n1; i >= 1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
                break;
            }
        }

        // Calculate EKOK
        for (int k = 1; k <= (n1 * n2); k++) {
            if ((k % n1 == 0) && (k % n2 == 0)) {
                ekok = k;
                break;
            }
        }

        // Show result
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
