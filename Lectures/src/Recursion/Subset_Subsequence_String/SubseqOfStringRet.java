// Find all the subsequences of string return it in a ArrayList
package Recursion.Subset_Subsequence_String;

import java.util.ArrayList;

public class SubseqOfStringRet {

    public static void main(String[] args) {
        System.out.println(subseqReturn("", "abc"));
    }

    private static ArrayList<String> subseqReturn(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subseqReturn(ans + ch, str.substring(1));
        ArrayList<String> right = subseqReturn(ans, str.substring(1));
        
        left.addAll(right);
        return left;
    }
}
