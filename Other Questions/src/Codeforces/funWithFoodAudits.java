// A. Fun with Food Audits
// https://codeforces.com/gym/104237/problem/A
package Codeforces;

import java.util.Scanner;

public class funWithFoodAudits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] garbage = new int[4];
        int sum = 0;
        for (int i = 0; i < garbage.length; i++) {
            garbage[i] = sc.nextInt();
            sum += garbage[i];
        }
        System.out.println(sum-24);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        System.out.println((a+b+c+d)-(6*4));
        
    }
}
