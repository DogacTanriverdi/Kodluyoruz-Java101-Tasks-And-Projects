package projects;

import java.util.Scanner;


public class AverageGradePointCalculator2 {

    public static void main(String[] args) {

        // Create variables
        double math, physics, chemistry, english, history, music, average;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Your math grade: ");
        math = input.nextInt();

        System.out.print("Your physics grade: ");
        physics = input.nextInt();

        System.out.print("Your chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Your english grade: ");
        english = input.nextInt();

        System.out.print("Your history grade: ");
        history = input.nextInt();

        System.out.print("Your music grade: ");
        music = input.nextInt();

        // Calculate grade point average
        average = ((math + physics + chemistry + english + history + music) / 6);

        if ((0 <= math && math <= 100) && (0 <= physics && physics <= 100) && (0 <= english && english <= 100) &&
                (0 <= chemistry && chemistry <= 100) && (0 <= music && music <= 100) &&
                (0 <= history && history <= 100)) {
            if (average <= 55) {
                System.out.println("You failed the class!");
            } else {
                System.out.println("You passed the class!");
            }
            System.out.println("Your grade point average: " + average);
        } else {
            System.out.println("At least one of the grades you entered is incorrect!");
        }
    }
}
