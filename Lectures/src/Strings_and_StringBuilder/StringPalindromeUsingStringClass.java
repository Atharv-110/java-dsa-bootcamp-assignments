// Prog to check whether String given is Palindrome or not using String Class

package Strings_and_StringBuilder;

public class StringPalindromeUsingStringClass {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-i-1);
            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
