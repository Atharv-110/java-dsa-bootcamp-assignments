// Write a program to skip a string if its not the required string

package Recursion.Subset_Subsequence_String;

public class SkipStringNotinRequired {
    public static void main(String[] args) {
        System.out.println(skipStringNotReq("absapplec"));
    }
    
    private static String skipStringNotReq(String str) {
        if (str.isEmpty()) {
            return "";
        }
        
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipStringNotReq(str.substring(3));
        } else {
            return str.charAt(0) + skipStringNotReq(str.substring(1));
        }
    }
}
