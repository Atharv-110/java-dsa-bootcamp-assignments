// WAP to find the minimum & maximum in an array using recursion

package Recursion.Easy;

public class MaxMinArray {
    public static void main(String[] args) {
    int[] arr = {100,2,599,-3,7,8};
    System.out.println("Maximum : " + maxElement(arr, arr.length-1, arr[0]));
    System.out.println("Minimum : " + minElement(arr, arr.length-1, arr[0]));
  }

  private static int maxElement(int[] arr, int i, int max) {
    if(i == 0) {
      return max;
    }
    if(max < arr[i]) max = arr[i];
    return maxElement(arr, i-1, max);
  }

    private static int minElement(int[] arr, int i, int min) {
        if (i == 0) {
            return min;
        }
        if (min > arr[i]) min = arr[i];
        return minElement(arr, i-1, min);
    }
  
  
}
