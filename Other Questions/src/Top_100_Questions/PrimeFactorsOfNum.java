// Prime Factors of a number

package Top_100_Questions;

public class PrimeFactorsOfNum {
    public static void main(String[] args) {
        findPrimeFactors(48);
    }
    
    private static void findPrimeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                int temp = num;
                while (temp % i == 0) {                    
                    System.out.print(i + " ");
                    temp /= i;
                }
            }
        }
        System.out.println();
    }
    
    private static boolean isPrime(int num) {
        boolean ans = true;
        if (num  < 2) {
            ans = true;
        }
        
        for(int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                ans = false;
            }
        }
        return ans;
    }
}
