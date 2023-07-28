// To check whether the number is abumdant or not

package Top_100_Questions;

public class AbundantNumber {
    public static void main(String[] args) {
        System.out.println(checkAbundant(18));
    }
    
    private static boolean checkAbundant(int num) {
        int sum = 0;
        
        for (int i = 1; i*i < num; i++) {
            if (num % i == 0) {
                if (i == 1) {
                    sum += i;
                } else if(i == num/i) {
                    sum += i;
                } else {
                    sum += i + num/i;
                }
            }
        }
        
        return sum > num;
    }
}
