// Program to find Sum of Nth Row in Pascals's Triangle

package Bitwise_Operators;

public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {
        int[][] pascal = {
            {1},
            {1, 1},
            {1, 2, 1},
            {1, 3, 3, 1},
            {1, 4, 6, 4, 1},
            {1, 5, 10, 10, 5, 1}
        };
        
        int n = 5;
        
        int sum = 1<<(n-1);
        System.out.println(sum);
    }
}
