public class Solution7 {

    public static void shapeOne(int height) {
        int empty_space = height;
        for (int i = 1; i <= height*2; i++) {
            if (i%2 == 0) {
                empty_space--;
                for (int j = 1; j <= empty_space; j++) {
                     
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                     
                    System.out.print("$");
                }
                System.out.println();
                
            }
            
        }
    }

    public static void shapeTwo(int height) {
        // use what you've learnt to complete this method
    }
    public static void shapeThree(int height) {
        // use what you've learnt to complete this method
    }
    public static void main(String[] args) {
        shapeOne(7);
        System.out.println();
        //shapeTwo(7);
        //System.out.println();
        //shapeThree(7);
         
    }
}
