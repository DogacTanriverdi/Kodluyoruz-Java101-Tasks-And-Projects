package projects;

import java.util.Scanner;

public class Project22 {

    public static void main(String[] args) {

        // 1 1 2 3 5 8 13 21

        System.out.println(fib(7));

        // fib(1) = 1
        // fib(2) = 1

        // fib(6) = fib(5) + fib(4)
        // fib(7) = fib(6) + fib(5)
        // fib(8) = fib(7) + fib(6)

        // fib(n) = fib(n - 1) + fib(n - 2)
    }

    static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
