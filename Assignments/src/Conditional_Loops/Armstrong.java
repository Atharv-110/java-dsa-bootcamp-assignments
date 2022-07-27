// Armstrong Number In Java

package Conditional_Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num = sc.nextInt();
        boolean res = isArmstrong(num);
        if (res) {
            System.out.println(num+" is an armstrong number.");
        }
        else{
            System.out.println(num+" is not an armstrong number.");
        }
    }
    static boolean isArmstrong(int n){
        int temp, digits = 0,res = 0;
        temp = n;
        while (temp > 0) {            
            temp /= 10;
            digits++;
        }
        temp = n;
        while(temp > 0){
            int rem = temp % 10;
            res += Math.pow(rem, digits);
            temp /= 10;
        }
        return res==n;
    }
}
