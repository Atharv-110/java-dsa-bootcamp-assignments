// Add to Array Form of Integer
// https://leetcode.com/problems/add-to-array-form-of-integer/

package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k  = 34;
        List<Integer> ans = addToArrayForm(num, k);
        System.out.println(ans);
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {            
            if (i >= 0) {
                ans.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                ans.add(k % 10);
                k /= 10;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}
