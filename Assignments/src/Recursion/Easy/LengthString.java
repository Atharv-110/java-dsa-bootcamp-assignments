// WAP to find the length of string using recursion

package Recursion.Easy;

public class LengthString {
    public static void main(String[] args) {
        System.out.println(lengthString("abcs"));
    }
    
    private static int lengthString(String str) {
        if (str.equals("")) {
            return 0;
        }
        
        return 1 + lengthString(str.substring(1));
    }
}
