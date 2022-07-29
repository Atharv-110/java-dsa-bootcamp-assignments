// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Maximum of 3 : "+max(a, b, c));
        System.out.println("Minimum of 3 : "+min(a, b, c));
    }

    static int max(int a, int b, int c) {
        int mx = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        return mx;
    }

    static int min(int a, int b, int c) {
        int mi = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        return mi;
    }
    
}
