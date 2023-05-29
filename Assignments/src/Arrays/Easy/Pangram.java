// Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

package Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(ans(sentence));
    }

    static boolean ans(String sentence) {
        boolean[] flag = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.toLowerCase().charAt(i);
            flag[ch - 97] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (flag[i] == false) {
                return false;
            }
        }
        return true;
    }
}
