// Leetcode 441: Arranging Coins
// https://leetcode.com/problems/arranging-coins/description/
package Searching.Easy;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrange_Coins(n));
    }

    private static int arrange_Coins(int n) {
        long start = 0;
        long end = n;
        while (start <= end) {            
            long mid = start + (end - start)/2;
            long k = mid * (mid+1)/2;
            if (k <= n) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
                
        return (int)(start-1);
    }
}
