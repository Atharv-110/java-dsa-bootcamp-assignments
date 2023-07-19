// Check Whether or Not the Number is an Armstrong Number

package Top_100_Questions;

public class ArmstrongNum {
    public static void main (String[] args) {
        System.out.println(checkArmstrong(153));
    }
    
//  This function checks if the number is armstrong number or not
    private static boolean checkArmstrong(int num) {
        int len = (int)Math.log10(num) + 1;
        return num == helper(num, len);
    }

//  This function returns the armstong value
    private static int helper(int num, int len) {
        if (num <= 1) {
            return num;
        }
        int digit = num % 10;
        return (int)Math.pow(digit, len) + helper(num/10, len);
    }
}
