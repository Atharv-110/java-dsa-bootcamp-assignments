// Geek-onacci Number
// https://practice.geeksforgeeks.org/problems/geek-onacci-number/
package Recursion.Easy;

import java.util.Scanner;

public class GeekonacciNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(geekNum(a, b, c, n));
        }
    }

    private static int geekNum(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        if (n == 3) {
            return c;
        }

        return geekNum(a, b, c, n - 1) + geekNum(a, b, c, n - 2) + geekNum(a, b, c, n - 3);

    }
}
