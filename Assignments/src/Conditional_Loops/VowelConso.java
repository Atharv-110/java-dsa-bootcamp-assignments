// Java Program Vowel Or Consonant
package Conditional_Loops;

import java.util.Scanner;

public class VowelConso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        String ch = sc.next();
        if (ch.toLowerCase().equals("a") || ch.toLowerCase().equals("e") || ch.toLowerCase().equals("i") || ch.toLowerCase().equals("o") || ch.toLowerCase().equals("u")) {
            System.out.println("Vowel");
        }
        else if (ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z') {
            System.out.println("Consonant");
        }
        else {
            System.out.println("Neither vowel nor consonant");
        }
    }
}