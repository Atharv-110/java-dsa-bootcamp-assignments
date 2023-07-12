// Linear Search using Recursion & return list & don't take it as in arguments

package Recursion.ArrayQuestions;

import java.util.ArrayList;

public class LinearSearchWithoutArgumentPassing {
    public static void main(String[] args) {
        int[] arr = {2,6,3,1,7,5,9,7,10};
        System.out.println(searchWithoutArg(arr, 11, 0));
    }

    private static ArrayList<Integer> searchWithoutArg(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        
        if (arr[index] == target) {
            list.add(index);
        }
        
        ArrayList<Integer> answFromBelow = searchWithoutArg(arr, target, index+1);
        list.addAll(answFromBelow);
        return list;
    }
}
