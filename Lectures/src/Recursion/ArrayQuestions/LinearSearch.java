// Program to find a particular item using recursion

package Recursion.ArrayQuestions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,1,9};
//        System.out.println(search(arr, 1, 0));
//        System.out.println(search2(arr, 2, 0));
//        System.out.println(search2(arr, 1, arr.length-1));
//        search3(arr, 2, 0);
//        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search4(arr, 6, 0, list));
        
    }
    
//  This function is for checking whether the target exists in the array or not
    private static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }
    
//  this function will return the index of target element if found
    private static int search1(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return search1(arr, target, index+1);
    }
    
//  this function will return the index of target element from last if found
    private static int search2(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        
        return search2(arr, target, index-1);
    }
    
//  this function will be void and add the elements in the arraylist
    static ArrayList<Integer> list = new ArrayList<>();
    private static void search3(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        search3(arr, target, index+1);
    }
    
//    this function will reaturn the arraylist and add the indices if the target is found
    private static ArrayList<Integer> search4(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        
        if(arr[index] == target) {
            list.add(index);
        }
        return search4(arr, target, index+1, list);
    }
}
