//Write a function to find if a number is a palindrome or not. Take number as parameter.

package Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        boolean ans = palindrome(num);
        if (ans) {
            System.out.println("Palindrome");
        }
        else { 
            System.out.println("Not Palindrome");
        }
    }

    static boolean palindrome(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {            
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        return sum==num;
    }
}
