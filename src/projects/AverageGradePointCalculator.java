package projects;

import java.util.Scanner;

public class AverageGradePointCalculator {
    public static void main(String[] args) {

        // Create variables
        int math, physics, chemistry, english, history, music;

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

        // Get and show results
        int total = (math + physics + chemistry + english + history + music);
        double result = total / 6.0;
        System.out.println("Your grade point average: " + result);

        // Passed the class?
        boolean passedTheClass = (result >= 60);
        String pstResult = passedTheClass ? "You passed the class!" : "You failed the class";
        System.out.println(pstResult);
    }
}
