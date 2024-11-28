package putils;
import java.util.Scanner;

public class DuckNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Duck Number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int num) {
        // Duck Number cannot start with 0 (but 0 itself is not a Duck Number)
        if (num <= 0) {
            return false;
        }

        // Check each digit for a zero
        while (num > 0) {
            if (num % 10 == 0) {
                return true; // Found a zero, it's a Duck Number
            }
            num /= 10; // Remove the last digit
        }

        return false; // No zero found
    }
}

