package tasks;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        // Variables
        int n, i = 2;

        // Define Scanner class
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = inp.nextInt();

        if (isPrime(n, i))
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }

    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }
}
