public class Solution6 {
    public static void main(String[] args) {
        int oddMultiplication = 1;
        int evenSum = 0;

        for (int i = 1; i <= 20; i+=2) {
            oddMultiplication *= i;
        }

        for (int i = 2; i <= 100; i+=2) {
            evenSum += i;
        }

        System.out.println("Multiplication of all odd numbers from 1 to 20: " + oddMultiplication);
        System.out.println("Sum of all even numbers from 1 to 100: " + evenSum);
    
    }
}
