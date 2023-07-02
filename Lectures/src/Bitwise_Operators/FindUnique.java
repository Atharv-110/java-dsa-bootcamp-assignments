// Program to find unique number in an array
package Bitwise_Operators;

public class FindUnique {

    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique = 0;
        
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
