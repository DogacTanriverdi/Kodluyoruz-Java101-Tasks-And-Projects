package projects;

import java.util.Scanner;

public class PalindromicWordFinder {
    public static void main(String[] args) {

        // Variables
        String word;

        // Define Scanner Class
        Scanner input = new Scanner(System.in);

        // Get Inputs From User
        System.out.print("Enter a word: ");
        word = input.nextLine();

        System.out.println(isPalindromic(word));
    }

    static boolean isPalindromic(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);
        return str.equals(reverse);
    }
}
