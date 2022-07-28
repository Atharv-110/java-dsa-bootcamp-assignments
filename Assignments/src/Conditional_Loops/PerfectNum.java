// Perfect Number In Java

package Conditional_Loops;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        boolean ans = perfect(num);
        if (ans == true) {
            System.out.println("Perfect");
        }
        else {
            System.out.println("Not Perfect");
        }
    }

    static boolean perfect(int num) {
        int res = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                res += i;
            }
        }
        return num == res;
    }
}
