// Factorial of a Number

package Top_100_Questions;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    
//  This function return the factorial of a number
    private static int factorial(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }
}
