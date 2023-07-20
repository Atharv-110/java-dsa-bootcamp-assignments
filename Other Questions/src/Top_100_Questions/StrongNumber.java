// Check Whether or Not the Given Number is a Strong Number

package Top_100_Questions;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(checkStrong(145));
    }
    
    private static boolean checkStrong(int num) {
        int sum = findSum(num);
        if (num == 2) {
            return true;
        }
        return num == sum;
    }

    private static int findSum(int num) {
        if (num <= 1) {
            return 1;
        }
        int digit = num % 10;
        return factorial(digit) + findSum(num/10);
    }

    private static int factorial(int num) {
        int pro = 1;
        for (int i = 1; i <= num; i++) {
            pro *= i;
        }
        return pro;
    }
    
}
