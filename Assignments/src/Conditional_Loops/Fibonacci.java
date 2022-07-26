// Fibonacci Series In Java Programs
package Conditional_Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pre = 0, nxt = 1, sum = 0, count = 2;
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series : ");
        System.out.print(pre + "\t" + nxt);
        while (count <= n) { 
            sum = pre + nxt;    
            System.out.print("\t" + sum);
            pre = nxt;
            nxt = sum;
            count++;
        }
        System.out.println();
    }
}
