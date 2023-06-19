package projects;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        // Create variables
        // Tax = income <= 1000 -> 18% || income >= 1000 -> 8%
        double income, incomeWithTax, taxAmount, taxRate = 0.18;
        boolean incomeAmount;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Your income: ");
        income = input.nextDouble();

        // Calculate tax rate
        incomeAmount = (income <= 1000);
        taxRate = incomeAmount ? taxRate : 0.08;

        // Calcualte tax amount
        taxAmount = income * taxRate;

        // Calculate tax
        incomeWithTax = (income + taxAmount);

        // Show results
        System.out.println("Price without tax: " + income);
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Tax amount: " + taxAmount);
        System.out.println("Price with tax: " + incomeWithTax);
    }
}
