// Find all prime numbers in given interval

package Top_100_Questions;

public class PrimeNumsInRange {
    public static void main(String[] args) {
        findAllPrimeNums(1, 20);
    }
    
    private static void findAllPrimeNums(int start, int end) {
        System.out.println("Prime numbers in given range are : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int i) {
        boolean prime = true;
        if (i < 2) {
            prime = false;
        }
        for (int j = 2; j*j <= i; j++) {
            if (i % j == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
