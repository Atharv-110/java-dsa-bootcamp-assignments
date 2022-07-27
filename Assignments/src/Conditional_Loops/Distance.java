// Calculate Distance Between Two Points
package Conditional_Loops;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinates for point1 : ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter the coordinates for point2 : ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("Distance = "+distance);
    }
}