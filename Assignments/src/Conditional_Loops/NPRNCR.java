// Find Ncr & Npr

package Conditional_Loops;

import java.util.Scanner;

public class NPRNCR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of n and r : ");
        int n = sc.nextInt(), r = sc.nextInt();
        System.out.println("Permutation : "+permutation(n, r));
        System.out.println("Combination : "+combination(n, r));
    }
    static double permutation(int n, int r){
        int deno = n - r;
        int f1=1, f2=1;
        
        for (int i = 1; i <= n; i++) {
            f1 *= i;
        }

        for (int i = 1; i <= deno; i++) {
            f2 *= i;
        }
        
        double perm = f1 / f2;
        
        return perm;
    }
    
    static double combination(int n, int r){
        double perm = permutation(n, r);
        int f3 = 1;
        for (int i = 1; i <= r; i++) {
            f3 *= i;
        }
        double comb = perm / f3;
        return comb;
    }
}
