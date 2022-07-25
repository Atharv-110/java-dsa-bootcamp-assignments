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
        int res = 0;
        System.out.println("Fibonacci Series : ");
        while (res <= n) {            
            System.out.print(res+ "\t");
            prev = nxt;
            nxt = res;
            res = prev + nxt;
        }
    }
    
}
