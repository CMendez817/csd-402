// Cameron Mendez
// M1 Programming Assignment
// 08/16/2025

// Calculates energy needed to heat water



import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for water mass in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt the user for initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Prompt the user for final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy needed using formula Q = mass * (final - initial) * 4184
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + energy + " Joules");

        input.close();
    }
}
