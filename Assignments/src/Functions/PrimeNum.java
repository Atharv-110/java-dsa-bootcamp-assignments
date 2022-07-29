// Define a method to find out if a number is prime or not.
package Functions;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        boolean ans = primeCheck(num);
        if (ans) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

    static boolean primeCheck(int num) {
        if (num <= 1) {
            return false;
        }
        int i = 2;
        while (i*i < num) {            
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
