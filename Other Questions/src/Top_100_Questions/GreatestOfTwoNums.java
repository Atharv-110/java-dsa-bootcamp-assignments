// Find the Greatest of the Two Numbers

package Top_100_Questions;

public class GreatestOfTwoNums {
    public static void main(String[] args) {
        int ans = greater(2, 5);
        if (ans < 0) {
            System.out.println("Both are equal");
        } else {
            System.out.println(ans + " is greater");
        }
    }
    
    private static int greater(int n1, int n2) {
        if (n1 == n2) {
            return -1;
        }
        return n1 > n2 ? n1 : n2;
    }
}
