// Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/

package Linear_Search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr =   {
                        {1,5},{7,3},{3,5}
                    };
        System.out.println("max wealth : "+maximumWealth(arr));
    }

    static int maximumWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int[] ar : arr) {
            int sum = 0;
            for(int acc : ar){
                sum += acc;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
