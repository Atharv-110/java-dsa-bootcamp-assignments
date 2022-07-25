// Take 2 numbers as input and print the largest number.
package FirstJava;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two nos : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println(n1+" is greater than "+n2);
        }
        else{
            System.out.println(n2+" is greater than "+n1);
        }
    }
}
