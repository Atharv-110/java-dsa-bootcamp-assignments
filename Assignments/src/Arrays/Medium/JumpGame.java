// Leetcode 55: Jump Game
// https://leetcode.com/problems/jump-game

package Arrays.Medium;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }

    private static boolean canJump(int[] arr) {
        int reach = 0;
        for (int i = 0; i < arr.length; i++) {
            if (reach < i) {
                return false;
            }
            reach = Math.max(reach,i+arr[i]);
        }
        return true;
    }
}
