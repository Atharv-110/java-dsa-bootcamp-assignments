// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amt, time & rate : ");
        int p = sc.nextInt();
        int t = sc.nextInt();
        float r = sc.nextFloat();
        System.out.println("Simple Interest : "+((p*r*t)/100));
    }
    
}
