// Program to find number of zeros

package Recursion.EasyQuestions;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZero(120020));
    }
    
    private static int countZero(int n) {
        return helperFunction(n, 0);
    }

    private static int helperFunction(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if(rem == 0) {
            return helperFunction(n/10, ++c);
        }
        return helperFunction(n/10, c);
    }
}
