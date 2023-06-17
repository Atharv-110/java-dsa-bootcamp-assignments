// Prog to check whether String given is Palindrome or not using String Class
package Strings_and_StringBuilder;

public class StringPalindromUsingBuilder {

    public static void main(String[] args) {
        String str = "abba";
        System.out.println(checkPalindromee(str));
    }

    private static boolean checkPalindromee(String str) {
        StringBuilder sbuild = new StringBuilder(str);
        sbuild.reverse();
        if ((sbuild.toString()).equals(str)) {
            return true;
        }
        return false;
    }
}
