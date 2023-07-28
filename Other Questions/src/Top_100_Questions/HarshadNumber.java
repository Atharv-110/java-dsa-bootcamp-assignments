// To check whether the number is harshad's number or not
package Top_100_Questions;

public class HarshadNumber {

    public static void main(String[] args) {
        System.out.println(checkHarshad(4991));
    }

    private static boolean checkHarshad(int num) {
        int sum = 0;
        int rem = 0;
        while (num != 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        
        if (num % sum == 0) {
            return true;
        }
        
        return false;
    }
}
