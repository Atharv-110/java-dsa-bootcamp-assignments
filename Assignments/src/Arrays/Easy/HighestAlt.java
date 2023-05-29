// Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/

package Arrays;

public class HighestAlt {
    public static void main(String[] args) {
        int[] gains = {-4,-3,-2,-1,4,3,2};
        System.out.println(highest(gains));
    }

    static int highest(int[] gains) {
        int sum = 0, max = 0;
        for (int gain : gains) {
            sum += gain;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
