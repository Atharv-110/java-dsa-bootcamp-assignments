// Search in Sorted Matrix, We will use Binary Search

package Binary_Search;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        int target = 3;
        
        System.out.println(Arrays.toString(search(arr,target)));
    }

    private static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (cols == 0) {
            return new int[]{-1,-1};
        }
        if (rows == 1) {
            return BinarySearch(arr,0,0,cols-1,target);
        }
        
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        
        while (rStart < (rEnd - 1)) {            
            int mid = rStart + (rEnd - rStart)/2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid,cMid};
            }
            if (target > arr[mid][cMid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        
        if (target == arr[rStart][cMid]) {
            return new int[]{rStart,cMid};
        }
        if (target == arr[rStart+1][cMid]) {
            return new int[]{rStart+1,cMid};            
        }
        
        if (target <= arr[rStart][cMid-1]) {
            return BinarySearch(arr, rStart, 0, cMid-1, target);
        }
        
        if (target >= arr[rStart][cMid+1] && target <=arr[rStart][cols-1]) {
            return BinarySearch(arr, rStart, cMid+1, cols-1, target);
        }
        
        if (target <= arr[rStart+1][cMid-1]) {
            return BinarySearch(arr, rStart+1, 0, cMid-1, target);
        }
        else {
            return BinarySearch(arr, rStart+1, cMid+1, cols-1, target);
        }
    }

    private static int[] BinarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd-cStart)/2;
            if(target == arr[row][mid]) {
                return new int[]{row,mid};
            }
            if (target > arr[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
