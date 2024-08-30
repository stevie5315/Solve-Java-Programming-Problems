
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
    public static void main(String[] args) {
        // Shape 1
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Shape 2
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("&");
            }
            System.out.println();
        }
        System.out.println();
        //Shap 3
        System.out.println("@");
        for (int i = 1; i <= 4 ; i++) {
            System.out.print("@");
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("@");
        }
        for (int i = 1; i <= 4; i++) {
            System.out.print("@ ");
        }

    }
    
}
