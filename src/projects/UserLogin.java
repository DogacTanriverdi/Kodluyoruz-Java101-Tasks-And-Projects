package projects;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        // Create variables
        String userName, password, resetPassword, newPassword;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("User name: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        // Log in
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Logged in!");
        } else if (!(userName.equals("patika"))) {
            System.out.println("Username is incorrect.");
        } else {
            System.out.println("Password is incorrect!");
            System.out.print("Reset password? : ");
            resetPassword = input.nextLine();
            if (resetPassword.equals("yes")) {
                System.out.print("New password: ");
                newPassword = input.nextLine();
                if ((newPassword.equals(password)) || (newPassword.equals("java123"))) {
                    System.out.println("The new password you entered " +
                            "cannot be the same as the password you entered incorrectly " +
                            "or the password you forgot.");
                    System.out.println("You not logged in!");
                } else {
                    System.out.println("Password created. You logged in!");
                    password = newPassword;
                }
            } else {
                System.out.println("You not logged in!");
            }
        }
    }
}
