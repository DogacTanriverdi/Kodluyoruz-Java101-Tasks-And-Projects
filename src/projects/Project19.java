package projects;

import java.util.Scanner;

public class Project19 {

    public static void main(String[] args) {

        // Create variables
        String userName, password;
        int right = 3, select;
        double balance = 1500.00, price;

        // Define Scanner class
        Scanner inp = new Scanner(System.in);

        // Get inputs from user & Apply actions
        while (right > 0) {
            System.out.print("User name: ");
            userName = inp.nextLine();
            System.out.print("Password: ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, " + userName + ". Welcome to Kodluyoruz Bank");
                do {
                    System.out.println("""
                            1- Deposit money
                            2- Withdraw money
                            3- Balance inquiry
                            4- Log out
                            """);
                    System.out.print("Please select the action you want to do: ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Amount of money: ");
                            price = inp.nextDouble();
                            balance += price;
                            System.out.println("Your deposit has been made");
                        }
                        case 2 -> {
                            System.out.print("Amount of money: ");
                            price = inp.nextDouble();
                            if (price > balance)
                                System.out.println("Insufficient balance!");
                            else
                                balance -= price;
                            System.out.println("Your withdraw has been made");
                        }
                        case 3 -> System.out.println("Your balance: " + balance);
                        case 4 -> System.out.println();
                        default -> System.out.println("Invalid action!");
                    }
                } while (select != 4);
                System.out.println("Logged out! See you again :)");
                break;
            } else {
                right--;
                if (!(right == 0))
                    System.out.println("User name or password is incorrect! Try again.");
                else
                    System.out.println("User name or password is incorrect!");
                if (right == 0)
                    System.out.println("Your account has been blocked!");
                else
                    System.out.println("Renaining right: " + right);
            }
        }
    }
}
