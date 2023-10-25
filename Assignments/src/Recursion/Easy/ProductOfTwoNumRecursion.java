// WAP to calculate product of 2 nums using recursion
// https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
package Recursion.Easy;

public class ProductOfTwoNumRecursion {

    public static void main(String[] args) {
        System.out.println(productOfTwo(2, 22));
    }

    private static int productOfTwo(int a, int b) {
//      If a < b then swap and then proceed
        if (a < b) {
            return productOfTwo(b, a);
        } else if (b != 0) {
            return a + productOfTwo(a, b - 1);
        } else {
            return 0;
        }
    }
}
