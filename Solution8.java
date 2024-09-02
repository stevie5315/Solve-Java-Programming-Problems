import java.util.Scanner;

public class Solution8 {

    /**
    * This Java method `isPrime` checks if a given integer `num` is a prime number. 
    * It returns `true` if the number is prime and `false` otherwise.

    * Here's a brief explanation:

    * It first checks if the number is less than or equal to 1, in which case it's not prime.
    * Then, it checks divisibility from 2 to the square root of the number. 
    * If the number is divisible by any of these values, it's not prime.
    * If the number passes these checks, it's considered prime.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int num) {
        /**
         * Checking divisibility up to the square root of the number is an optimization technique. Here's why it works:
         * If a number `num` has a divisor `i` greater than its square root, it must also have a corresponding divisor
         *  `j` less than its square root, such that `i * j = num`.
         * This is because the square root of `num` is the "middle" value, and if `i` is greater than the square root, 
         * `j` must be less than it.
         * Therefore, if we don't find any divisors less than or equal to the square root, we can be sure that 
         * there are no divisors greater than the square root either.

         * By only checking up to the square root, we reduce the number of iterations in the loop, 
         * making the algorithm more efficient.
         */
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}