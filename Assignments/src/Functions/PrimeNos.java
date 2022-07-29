// Write a function that returns all prime numbers between two given numbers.
package Functions;

import java.util.Scanner;

public class PrimeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no. for range : ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (checkP(i)) {
                System.out.println(i + "\t");
            }
        }  
    }

    static boolean checkP(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
