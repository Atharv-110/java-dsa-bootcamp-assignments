//Define a method that returns the product of two numbers entered by user.

package Functions;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 num : ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Product : "+product(a,b));
    }

    static int product(int a, int b) {
        return a * b;
    }
}
