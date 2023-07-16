// Find the reverse of a number

package Top_100_Questions;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(reverse1(num));
        System.out.println(reverse(num));
    }
  
//  Recursive method
    private static int reverse1(int num) {
        int rev = 0;
        return helper(num , rev);   
    }

//  Iterative method
    private static int reverse(int num) {
        int rem, reverse = 0;
        while (num != 0) {            
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse;
    }

    private static int helper(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int rem = num % 10;
        rev = rev * 10 + rem;
        return helper(num/10, rev);
    }
    
}
