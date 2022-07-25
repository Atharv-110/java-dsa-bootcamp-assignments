// To find out whether the given String is Palindrome or not.
package FirstJava;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        String rstr = "";
        int strlen = str.length();
        int i = strlen-1;
        while (i >= 0) {            
            rstr += str.charAt(i);
            i--;
        }
        if (str.toLowerCase().equals(rstr.toLowerCase())) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
