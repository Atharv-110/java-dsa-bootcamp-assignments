// Write a program to skip a particular string and get the remaining string as it is
package Recursion.Subset_Subsequence_String;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skipString("bcdapplefg"));
    }
    
    private static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        
        if (str.startsWith("apple")) {
            return skipString(str.substring(5));
        }
        else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}
