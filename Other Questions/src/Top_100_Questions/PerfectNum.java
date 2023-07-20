// Check Whether or Not the Number is a Perfect Number

package Top_100_Questions;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println(checkPerfect(6));
    }
    
    private static boolean checkPerfect(int num) {
        int sum = findSum(num);
        return sum == num;
    }

    private static int findSum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
