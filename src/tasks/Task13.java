package tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        // Variables
        int n1, n2, i, k, ebob = 1, ekok = 1;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        // Calculate EBOB
        i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
                break;
            }
            i--;
        }

        // Calculate EKOK
        k = 1;
        while (k <= (n1 * n2)) {
            if ((k % n1 == 0) && (k % n2 == 0)) {
                ekok = k;
                break;
            }
            k++;
        }

        // Show results
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
