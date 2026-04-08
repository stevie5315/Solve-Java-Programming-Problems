import java.util.Scanner;

public class Solution4 {

    /**
     * Prints the largest and the smallest of 10 different integers provided by user.
     * <p>
     * Here's how the program works:
     * 1. We create an array numbers to store the 10 input integers.
     * 2. We initialize largest to Integer.MIN_VALUE and smallest to Integer.MAX_VALUE.
     * 3. We use a while loop to input 10 integers.
     * 4. For each input integer, we check if it already exists in the numbers array using the contains method. If it does, we prompt the user to enter a different number.
     * 5. If the input integer is new, we add it to the numbers array and update largest and smallest if necessary.
     * 6. After the loop, we print the largest and smallest numbers.
     * Note that the contains method is used to check if an integer already exists in the numbers array. 
     * This method iterates through the array and returns true if the value is found, and false otherwise.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        /*
         * By setting largest to Integer.MIN_VALUE, we ensure that any input integer will be larger than largest initially. 
         * This is because Integer.MIN_VALUE is the smallest possible value that can be represented by an int.
         * 
         * Similarly, by setting smallest to Integer.MAX_VALUE, we ensure that any input integer will be smaller 
         * than smallest initially. This is because Integer.MAX_VALUE is the largest possible value that can 
         * be represented by an int.
         * 
         * By initializing largest and smallest to these extreme values, we ensure that the program can 
         * correctly determine the largest and smallest input integers without having to worry about
         * whether the first input integer will be larger or smaller than the initial values.
         */
       

        System.out.println("Enter 10 different integers:");
        int i = 1;
        while (i <= 10) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();
            if (contains(numbers, num)) {
                System.out.println("Number already exists. Please enter a different number.");
            } else {
                numbers[i-1] = num;
                if (num > largest) {
                    largest = num;
                }
                if (num < smallest) {
                    smallest = num;
                }
                i++;
            }
        }
        scanner.close();
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}