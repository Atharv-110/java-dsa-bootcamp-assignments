// Program to find the reverse of a number using recursion

package Recursion.EasyQuestions;

public class ReverseOfNumber {
    static  int sum = 0;
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }
    
//    pure recursive method
    static int reverse2(int n) {
        int digits = (int)(Math.log10(n))+1;
        return helperFun(n, digits);
    }
    
    private static int helperFun(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helperFun(n/10, digits-1);
    }
    
//    Main Method
    public static void main(String[] args) {
//        reverse1(1234);
        System.out.println(reverse2(12355));
    }

    
    
}
