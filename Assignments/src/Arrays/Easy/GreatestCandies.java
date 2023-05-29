// Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> res = kidsWithCandies(candies, extraCandies);
        System.out.println(res);
//        System.out.println(Arrays.asList().toString(kidsWithCandies(candies, extraCandies)));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
//                Boolean False = null;
                ans.add(Boolean.FALSE);
            }
            else {
                ans.add(Boolean.TRUE);
            }
        }
        return ans;
    }
}
