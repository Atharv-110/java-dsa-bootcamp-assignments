// Write a program to skip a specific letter and return the remaining string
package Recursion.Subset_Subsequence_String;

public class SkipALetter {

    public static void main(String[] args) {
//        skipLetter("", "baac");
        System.out.println(skipLetter2("bahac"));
    }
    
    private static void skipLetter(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        if (ch == 'a') {
            skipLetter(ans, str.substring(1));
        } else {
            skipLetter(ans + ch, str.substring(1));
        }
    }
    
    private static String skipLetter2(String str) {
        if (str.isEmpty()) {
            return "";
        }
        
        char ch = str.charAt(0);
        if (ch == 'a') {
            return skipLetter2(str.substring(1));
        } else {
            return ch+skipLetter2(str.substring(1));
        }
    }
    
}
