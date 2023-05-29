// Leetcode 1217: Minimum Cost to Move Chips to the same position

package Arrays;

public class MinCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {2,2,2,4,4};
        System.out.println(minCostToMoveChips(position));
    }

    private static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        if (even <= odd) {
            return even;
        }
        return odd;
    }
}
