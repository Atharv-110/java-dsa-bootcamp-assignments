// Use Recursive function to print nos from 1 to 5

package Recursion;

public class Example1 {
    public static void main(String[] args) {
        print(1);
    }

    private static void print(int n) {
        if(n==5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
