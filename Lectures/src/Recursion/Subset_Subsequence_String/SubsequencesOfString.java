// Find the subsequences of a string

package Recursion.Subset_Subsequence_String;

public class SubsequencesOfString {
    public static void main(String[] args) {
        subsequence("", "abc");
    }
    
    private static void subsequence(String ans, String str) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        subsequence(ans + ch, str.substring(1));
        subsequence(ans, str.substring(1));
    }
}
