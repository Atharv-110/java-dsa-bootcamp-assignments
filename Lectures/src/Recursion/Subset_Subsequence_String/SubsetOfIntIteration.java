// Find the subset of integers in a array using Iteration
package Recursion.Subset_Subsequence_String;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfIntIteration {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        
        for(List<Integer> list : ans) {
            System.out.print(list + " ");
        }
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        
        for(int num : arr) {
            int n = outer.size();
            for(int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
