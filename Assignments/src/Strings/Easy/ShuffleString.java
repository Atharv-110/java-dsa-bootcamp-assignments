// Shuffle String
// https://leetcode.com/problems/shuffle-string/

package Strings.Easy;

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(str, indices));
    }
    
    public static String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ans);
    }
}
