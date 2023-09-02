// First uppercase letter in a string
// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

package Recursion.Easy;

public class FirstUpperCase {
    public static void main(String[] args) {
        String str = " geeksforgeeKs";
        System.out.println(firstUpperCase(str));
    }
    
    private static char firstUpperCase(String str) {
        if (str.isEmpty()) {
            return '\0';
        }
        char ch = str.charAt(0);
        if (Character.isUpperCase(ch)) {
            return ch;
        }
        return firstUpperCase(str.substring(1));
    }
}
