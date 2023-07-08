// Find the prime numbers less than the given number

package Maths_For_DSA;

public class PrimeNoRange {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        findPrimes(n, primes);
    }
    
    private static void findPrimes(int n, boolean[] primes) {
        for(int i = 2; i*i <= n; i++) {
            if(!primes[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        
        for(int i = 2; i <= n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
