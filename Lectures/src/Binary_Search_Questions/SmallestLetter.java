// Find Smallest Letter Greater Than Target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package Binary_Search_Questions;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans = smallest_Letter(letters, target);
        System.out.println(ans);
    }
    static char smallest_Letter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {            
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
//start % letters.length is implemented because of the word wrapping if the greater than target isnt available then element at index[0] should be returned.
    }
}
