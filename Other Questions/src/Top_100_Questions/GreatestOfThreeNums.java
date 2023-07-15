// Find the greatest of 3 numbers

package Top_100_Questions;

public class GreatestOfThreeNums {
    public static void main(String[] args) {
        System.out.println(greatest(8, 10, 6));
    }
    
    private static int greatest(int a, int b, int c) {
        int temp = a > b ? a : b;
        int result = temp > c ? temp : c;
        return result;
    }
}
