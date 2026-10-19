package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your pickup date: ");
        String pickupDate = input.nextLine();

        System.out.print("Do you want an electronic toll tag at $3.95/day (yes/no): ");
        String electronicTollTag = input.nextLine();

        System.out.print("Do you want a GPS at $2.95/day (yes/no): ");
        String GPS = input.nextLine();

        System.out.print("Do you want roadside assistance at $3.95/day (yes/no): ");
        String roadsideAssistance = input.nextLine();

        System.out.print("What is your age: ");
        int age = input.nextInt();
        input.nextLine();

        double optionsTotal = 0;
        double underAgeSurcharge = 0;
        double carRentalCharge = 29.99;

        if (electronicTollTag.equals("yes") || electronicTollTag.equals("y")) {
            optionsTotal += 3.95;
        }
        if (GPS.equals("yes") || GPS.equals("y")) {
            optionsTotal += 2.95;
        }
        if (roadsideAssistance.equals("yes") || roadsideAssistance.equals("y")) {
            optionsTotal += 3.95;
        }
        if (age < 25) {
            underAgeSurcharge += carRentalCharge * 0.3;
        }

        System.out.printf("Your pickup date is %s%n", pickupDate);
        System.out.printf("Your basic car rental per day is %.2f%n", carRentalCharge);
        System.out.printf("Your total options cost is %.2f%n", optionsTotal);
        System.out.printf("Your underage driver surcharge is %.2f%n", underAgeSurcharge);
        System.out.printf("Your total cost is %.2f", (carRentalCharge + optionsTotal + underAgeSurcharge));

    }
}
