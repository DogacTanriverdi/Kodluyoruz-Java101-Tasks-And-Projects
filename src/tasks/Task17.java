package tasks;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        // Variables
        int n = 100;

        // Print prime numbers from 1 to 100
        for (int i = 2; i <= n; i++) {
            int factorCount = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    factorCount++;
            }

            if (factorCount == 0)
                System.out.print(i + " ");
        }
    }
}
