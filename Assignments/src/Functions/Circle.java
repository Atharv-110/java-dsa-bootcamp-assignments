// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radii of the circle : ");
        int rad = sc.nextInt();
        System.out.println("Circumference : "+circ(rad));
        System.out.println("Area : "+area(rad));
    }

    static float circ(int rad) {
        return (float)(2*3.14*rad);
    }

    static float area(int rad) {
        return (float)(Math.pow(rad, 2)*3.14);
    }
}
