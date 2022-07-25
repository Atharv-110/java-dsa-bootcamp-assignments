// Take name as input and print a greeting message for that particular name.
package FirstJava;

import java.util.Scanner;

public class PrintMsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next().trim();
        System.out.println("Good Morning, "+ name);
    }
}
