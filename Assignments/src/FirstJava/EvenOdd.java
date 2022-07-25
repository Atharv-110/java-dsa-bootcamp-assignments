// Write a program to print whether a number is even or odd, also take input from the user.
package FirstJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
