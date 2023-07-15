// Write a program to check if a given number is prime or not

package Top_100_Questions;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num + " is prime -> " + isPrime(num));
    }
    
    private static boolean isPrime(int num) {
        boolean answer = true;
        if (num < 2) {
            answer = false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                answer = false;
            }
        }
        return answer;
    }
}
