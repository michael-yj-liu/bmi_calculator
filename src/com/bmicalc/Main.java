package com.bmicalc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    // Declare a decimal format that rounds to one decimal place
    public static DecimalFormat df = new DecimalFormat("0.0"); // Create a df, object from DecimalFormat class

    public static void main(String[] args) {
        // Welcome Message
        System.out.println("BMI Calculator\nPlease enter your height and weight.");

        // Prompt for user height and user weight
        Scanner scanner = new Scanner(System.in); // Scanning for user input
        System.out.print("Height (in cm): "); // Prompt for user height
        double height_cm = scanner.nextFloat(); // User height stored in variable, height_cm
        System.out.print("Weight (in kg): "); // Prompt for user weight
        double weight = scanner.nextFloat(); // User weight stores in variable, weight

        // Calculate BMI Index
        double height_m = height_cm/100; // Convert user height in cm to m
        double bmi = weight/Math.pow(height_m, 2); // Calculate BMI index given height and weight

        System.out.println("Your BMI index is " + df.format(bmi));

        // Based on BMI Index indicate if the user is underweight, normal weight,overweight or obese
        if (bmi < 18.5) { // Underweight
            System.out.println("This is considered underweight.");
        } else if (bmi >= 18.5 || bmi <= 24.9) { // Normal weight
            System.out.println("This is considered normal weight.");
        } else if (bmi >= 25 || bmi <= 29.9) { // Overweight
            System.out.println("This is considered overweight.");
        } else if (bmi > 30) { // Obese
            System.out.println("This is considered obese");
        }
        // Try to replace the if...else if... statements with switch and case
    }
}
