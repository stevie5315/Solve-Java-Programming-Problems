
public class Solution1 {

     /**
     * Prints three different shapes to the console using nested loops.
     * Shape 1: A right triangle with numbers on the left and asterisks on the right.
     * Shape 2: An inverted right triangle with numbers on the left and ampersands on the right
     * Shape 3: A triangle shape made of '@' characters
     * <p>
     * The output of this program is:
     * <pre>
     * 1*****
     * 12****
     * 123***
     * 1234**
     * 12345*
     * 123456
     *
     * 12345&
     * 1234&&
     * 123&&&
     * 12&&&&
     * 1&&&&&
     * &&&&&&
     *
     * @
     * @ @
     * @  @
     * @   @
     * @    @
     * @ @ @ @ 
     * </pre>
     */

     /**
     * Prints a right triangle with numbers on the left and asterisks on the right.
     *
     * @param height The height of the triangle.
     */
    public static void shapeOne(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = height; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints an inverted right triangle with numbers on the left and ampersands on the right.
     *
     * @param height The height of the triangle.
     */
    public static void shapeTwo(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = height; k >= i; k--) {
                System.out.print("&");
            }
            System.out.println();
        }
    }

    /**
     * Prints a triangle shape made of '@' characters.
     *
     * @param height The height of the triangle.
     */
    public static void shapeThree(int height) {
         System.out.println("@");
         for (int i = 1; i <= height ; i++) {
             System.out.print("@");
             for (int j = 1; j <= i; j++) {
                 System.out.print(" ");
             }
             System.out.println("@");
         }
         for (int i = 1; i <= height; i++) {
             System.out.print("@ ");
         }
    }

    /**
     * Prints three different shapes to the console using nested loops.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        shapeOne(6);
        System.out.println();
        shapeTwo(6);
        System.out.println();
        shapeThree(4);
    }
}