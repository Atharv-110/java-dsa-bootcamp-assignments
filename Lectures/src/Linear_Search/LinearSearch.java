// To search an element in an Array
package Linear_Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,22,88,99};
        int target = 1;
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Number not found!!");
        }
        else{
            System.out.println("Element is present at : "+index);
        }
    }
    
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
