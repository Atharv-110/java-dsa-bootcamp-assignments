// Find the Armstrong Numbers in a given Range

package Top_100_Questions;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        findAllArmstrong(1, 1000);
    }
    
    private static void findAllArmstrong(int start, int end) {
        int len = 0;
        for (int i = start; i <= end; i++) {
            len = (int)(Math.log10(i))+1;
            if (i == helper(i , len)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static int helper(int num, int len) {
        if (num <= 1) {
            return num;
        }
        int digit = num % 10;
        return (int)Math.pow(digit, len) + helper(num/10, len);
    }
}
