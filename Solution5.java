import java.util.Scanner;

public class Solution5 {
        /**
         * This program will keep asking the user to enter the base and exponent until they enter 
         * a non-zero base and a positive exponent. It then calculates the result using the
         * Math.pow() method and prints it.
         *
         * @param args The command line arguments (not used).
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, exponent;

        do {
            System.out.print("Enter the base (a number): ");
            base = scanner.nextDouble();
            System.out.print("Enter the exponent (a number): ");
            exponent = scanner.nextDouble();

            if (base == 0 && exponent <= 0) {
                System.out.println("Invalid input. Please enter a non-zero base and a positive exponent.");
            }
        } while (base == 0 && exponent <= 0);
        scanner.close();
        double result = Math.pow(base, exponent);
        System.out.println("The result is: " + result);
    }
}