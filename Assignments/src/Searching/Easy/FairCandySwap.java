// Leetcode 888: Fair Candy Swap
// https://leetcode.com/problems/fair-candy-swap/

package Searching.Easy;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {2,3};
        System.out.println(Arrays.toString(candySwap(A,B)));
    }
    
    static int[] candySwap(int[] A, int[] B) {
//        1. Find sum of both arrays
        int sumA = 0, sumB = 0;
        for(int i = 0; i < A.length; i++) {
            sumA+=A[i];
        }
        for(int i = 0; i < B.length; i++) {
            sumB+=B[i];
        }
        int[] ans = new int[2];
        for(int i = A.length-1; i>=0; i--) {
            for(int j = B.length-1; j>=0; j--) {
                int dif = A[i]-B[j];
                if(sumA-dif == sumB+dif) {
                    ans[0] = A[i];
                    ans[1] = B[j];
                    return ans;
                }
            }
        }
        
        return ans;
    }
}
