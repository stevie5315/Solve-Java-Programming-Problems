
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution3 {
    public static void printBox(int height, int width) {
        /**
         * Prints a box of given height and width with alphabet 'B'.
         *
         * @param height The height of the box.
         * @param width  The width of the box.
         */
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("B ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the height of the box: ");
                int height = scanner.nextInt();
                System.out.print("Enter the width of the box: ");
                int width = scanner.nextInt();
                if (height <= 0 || width <= 0) {
                    System.out.println("Height and width should be greater than zero.");
                } else {
                    printBox(height, width);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid input
            }
        }
        scanner.close();
    }
}