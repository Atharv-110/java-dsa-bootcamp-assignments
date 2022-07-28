// Program to calculate hcf/gcd and lcm for the 2 numbers
package Conditional_Loops;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1 and n2 : ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int hcf = gcd(n1, n2);
        int lcm = (n1 * n2) / hcf;
        System.out.println("GCD = "+hcf);
        System.out.println("LCM = "+lcm);
    }

    static int gcd(int n1, int n2) {
        int min = (n1<n2)?n1:n2, gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (n1%i==0 && n2%i==0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
