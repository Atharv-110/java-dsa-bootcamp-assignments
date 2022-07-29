// Define a program to find out whether a given number is even or odd.
package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        boolean ans = even_odd(num);
        if (ans) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }

    static boolean even_odd(int num) {
        return num % 2 == 0;
    }
}
