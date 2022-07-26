// To calculate Fibonacci Series up to n numbers.
package FirstJava;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n : ");
        int n = sc.nextInt();
        int prev = 0;
        int nxt = 1;
        int res = 0, count = 2;
        System.out.println("Fibonacci Series : ");
        System.out.print(prev + "\t" + nxt);
        while (count <= n) {            
            res = prev + nxt;
            System.out.print("\t" + res);
            prev = nxt;
            nxt = res;
            count++;
        }
        System.out.println();
    }
    
}
