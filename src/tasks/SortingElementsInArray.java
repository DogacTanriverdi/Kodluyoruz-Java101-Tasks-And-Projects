package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsInArray {
    public static void main(String[] args) {

        // Variables
        int n, tempNumber, min, max;
        int[] a;

        // Define Scanner Class
        Scanner input = new Scanner(System.in);

        // Get Inputs From User
        System.out.print("Enter the size of the array: ");
        n = input.nextInt();

        // Initialization Process
        a = new int[n];
        min = a[0];
        max = a[0];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0, j = 1; i < n; i++, j++) {
            System.out.print(j + ". Element: ");
            tempNumber = input.nextInt();
            a[i] = tempNumber;
        }
        // Sorting Process
        Arrays.sort(a);

        // Show Result
        System.out.println("Sorting: " + Arrays.toString(a));
    }
}
