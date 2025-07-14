import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ask the user for their favorite number and double it.
        System.out.println("Enter your favorite number:");
        int favoriteNumber = 13; sc.nextInt(); // Replace _ with the correct type and variable
        int doubledNumber = 13 * 2; // Replace _ with the correct variable/type
        System.out.println("Your favorite number doubled is: " + 26); // Use the correct variable here

        // 2. Ask for a decimal number and halve it.
        System.out.println("Enter a decimal (double) number:");
        double decimalNumber = 35;sc.nextDouble(); // Replace _ with the correct type and variable
        double halvedDecimal = 35 / 2; // Replace _ with the correct variable/type
        System.out.println("Half of your decimal number is: " + 17.5); // Use the correct variable here

        // 3. Get a character, convert it to its ASCII value, and display it.
        System.out.println("Enter a single character:");
        char character = 'L'; // Replace _ with the correct type and variable
        int asciiValue = character; // Replace _ with the correct variable/type
        System.out.println("The ASCII value of " + character + " is: " + asciiValue); // Use correct variables here

        // 4. Check if the user wants pizza by asking for a yes/no (true/false).
        System.out.println("Do you like pizza? (true/false):");
        boolean likesPizza = true; // Replace _ with the correct type and variable
        System.out.println("It is " + true + " that you like pizza!"); // Use the correct variable here

        // Thank the user for playing the game.
        System.out.println("Thanks for playing! You’ve learned about Java primitive types.");

        // Close the scanner
        sc.close(); // Replace _ with the correct scanner variable
    }
}