package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Print out ASCII Characters
        System.out.print("Numbers: ");
        AsciiChars.printNumbers();
        System.out.print("Upper case letters: ");
        AsciiChars.printUpperCase();
        System.out.print("Lower case letters: ");
        AsciiChars.printLowerCase();
        System.out.println();

        Scanner userInput = new Scanner(System.in);

        // Interactive portion
        System.out.print("Please enter your name: ");
        String userName = userInput.next();

        System.out.println("\nHello " + userName + "!");
        System.out.println("Do you wish to continue to the interactive portion? (yes/no): ");
        String userResp = userInput.next();

        if (userResp.equalsIgnoreCase("yes") || userResp.equalsIgnoreCase("y")) {
            do {
                System.out.print("Do you have a red car? (yes/no): ");
                String redCar = userInput.next();
                System.out.print("What's the name of your favorite pet?: ");
                String petName = userInput.next();
                System.out.print("What's the age of your favorite pet?: ");
                int petAge = userInput.nextInt();
                System.out.print("What's your lucky number?: ");
                int luckyNum = userInput.nextInt();

                System.out.print("Do you have a favorite quarterback? (yes/no): ");
                userResp = userInput.next();
                int jerseyNum = 0;

                if (userResp.equalsIgnoreCase("yes") || userResp.equalsIgnoreCase("y")) {
                    System.out.print("What is the jersey number?: ");
                    jerseyNum = userInput.nextInt();
                }

                System.out.print("What's the two-digit model year of your car?: ");
                int modelYear = userInput.nextInt();
                System.out.print("What's the first name of your favorite actor or actress?: ");
                String actorName = userInput.next();
                System.out.print("Enter a random number between 1 and 50: ");
                int randNum = userInput.nextInt();

                // Generating output
                Random random = new Random();
                int magicNum;
                final int maxMagicNum = 75;
                final int maxNum = 65;

                int rand1 = random.nextInt(25);
                int rand2 = random.nextInt(25);
                int rand3 = random.nextInt(25);

                // Choose the jersey number or the lucky number
                // Changed the multiply random number to add instead due to large number
                if ((random.nextInt(2) == 1) && (jerseyNum != 0)) {
                    magicNum = jerseyNum + rand1;
                } else {
                    magicNum = luckyNum + rand1;
                }
                if (magicNum > maxMagicNum) {
                    magicNum = magicNum - 75;
                } else if (magicNum < 1) {
                    magicNum = magicNum + rand1;
                }

                // Generate the other 5 numbers
                int num1, num2, num3, num4, num5;

                // Use the two digit model year of their car and add their lucky number to it
                num1 = modelYear + luckyNum;
                if (num1 > maxNum) {
                    num1 = num1 - maxNum;
                } else if (num1 < 1) {
                    num1 = num1 + rand1;
                }

                // Use the random number between 1 and 50, subtracting one of the generated
                // random numbers
                num2 = randNum - rand2;
                if (num2 > maxNum) {
                    num2 = num2 - maxNum;
                } else if (num2 < 1) {
                    num2 = num2 + rand2;
                }

                // Use the value 42
                num3 = randNum + rand3;
                if (num3 > maxNum) {
                    num3 = num3 - maxNum;
                } else if (num3 < 1) {
                    num3 = num3 + rand3;
                }

                // Use the age of their favorite pet + their car model year
                num4 = petAge + modelYear;
                if (num4 > maxNum) {
                    num4 = num4 - 65;
                } else if (num4 < 1) {
                    num4 = num4 + rand2;
                }

                // Favorite quarterback number + age of pet + lucky number
                num5 = jerseyNum + petAge + luckyNum;
                if (num5 > maxNum) {
                    num5 = num5 - 65;
                } else if (num5 < 1) {
                    num5 = num5 + rand3;
                }

                System.out.println("Lottery Numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5
                        + " Magic ball: " + magicNum);
                System.out.println("Would you like to answer questions to generate another set of numbers? (yes/no): ");
                userResp = userInput.next();
                if (userResp.equalsIgnoreCase("no") || userResp.equalsIgnoreCase("n")) {
                    System.out.println("Thank you. Goodbye.");
                    System.exit(0);
                }
            } while (userResp.equalsIgnoreCase("yes") || userResp.equalsIgnoreCase("y"));
        } else {
            userInput.close();
            System.out.println("Please return later to complete the survey");
        }
    }
}
