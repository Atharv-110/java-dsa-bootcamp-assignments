// Compound Interest Java Program -> priciple * (1 + rate/100)^time

package Conditional_Loops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle value : ");
        int p = sc.nextInt();
        System.out.print("Enter rate : ");
        float r = sc.nextFloat();
        System.out.print("Enter the time period : ");
        float t = sc.nextFloat();
        float comp_int = (float)(p * Math.pow((1 + (r/100)), t));
        System.out.println("Compound Interest = "+comp_int);
    }
}
