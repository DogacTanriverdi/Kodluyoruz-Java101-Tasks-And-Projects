package tasks;

import java.util.Scanner;


public class Task9 {

    public static void main(String[] args) {

        // Create variables
        int n, r, a, combination, totalN = 1, totalR = 1, totalM = 1;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the number of elements of the set:  ");
        n = input.nextInt();

        System.out.print("Enter the number of elements to combine: ");
        r = input.nextInt();

        // Calculate combination C(n,r)

        a = (n - r);

        for (int i = 1; i <= n; i++)
            totalN *= i;

        for (int i = 1; i <= r; i++)
            totalR *= i;

        for (int i = 1; i <= a; i++)
            totalM *= i;

        combination = totalN / (totalR * totalM);

        System.out.println(combination);
    }
}
