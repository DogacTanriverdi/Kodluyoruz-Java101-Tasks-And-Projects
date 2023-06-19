package tasks;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        // Variables
        int n, temp;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        n = input.nextInt();
        temp = n;

        subPattern(n, temp);
    }

    static void subPattern(int n, int temp) {
        if (n > 0) {
            System.out.print(n + " ");
            subPattern(n - 5, temp);
        } else if (n <= 0) {
            sumPattern(n, temp);
        }
    }

    static void sumPattern(int n, int temp) {
        if (temp >= n) {
            System.out.print(n + " ");
            sumPattern(n + 5, temp);
        }
    }
}
