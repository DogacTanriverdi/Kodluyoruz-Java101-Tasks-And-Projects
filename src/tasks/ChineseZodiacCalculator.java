package tasks;

import java.util.Scanner;

public class ChineseZodiacCalculator {

    public static void main(String[] args) {

        // Create variables
        int birthYear, calculateZodiac;
        String str = "Your Chniese zodiac sign: ";

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter your year of birth: ");
        birthYear = input.nextInt();

        // Calculate zodiac
        calculateZodiac = (birthYear % 12);

        // Show result
        switch (calculateZodiac) {
            case 0 -> System.out.println(str + "Monkey");
            case 1 -> System.out.println(str + "Rooster");
            case 2 -> System.out.println(str + "Dog");
            case 3 -> System.out.println(str + "Pig");
            case 4 -> System.out.println(str + "Mouse");
            case 5 -> System.out.println(str + "Ox");
            case 6 -> System.out.println(str + "Tiger");
            case 7 -> System.out.println(str + "Rabbit");
            case 8 -> System.out.println(str + "Dragon");
            case 9 -> System.out.println(str + "Snake");
            case 10 -> System.out.println(str + "Horse");
            case 11 -> System.out.println(str + "Sheep");
        }
    }
}