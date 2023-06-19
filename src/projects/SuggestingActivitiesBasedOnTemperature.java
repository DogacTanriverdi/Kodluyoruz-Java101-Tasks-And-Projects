package projects;

import java.util.Scanner;

public class SuggestingActivitiesBasedOnTemperature {

    public static void main(String[] args) {

        // Create variables
        int heat;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter temperature: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can ski.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("You can go to the cinema.");
            }
            if (heat >= 15) {
                System.out.println("You can have a picnic.");
            }
        } else {
            System.out.println("You can go swimming");
        }
    }
}
