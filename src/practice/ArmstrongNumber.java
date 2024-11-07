package practice;

import java.util.List;
public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 371;
        int originalNumber = number;
        int remainder;
        int result = 0;

        // Loop to calculate the sum of the cubes of the digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10; // Get the last digit
            result += Math.pow(remainder, 3); // Add the cube of the digit to the result
            originalNumber /= 10; // Remove the last digit from the number
        }

        // Check if the result equals the original number
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
