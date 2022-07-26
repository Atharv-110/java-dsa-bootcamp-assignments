// To find Armstrong Number between two given number.
package FirstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for start and end : ");
        int strt = sc.nextInt();
        int end = sc.nextInt();
        for (int i = strt; i <= end; i++) {
            int temp = 0, digits = 0, last = 0, sum = 0;
            temp = i;
            while (temp>0) {                
                temp /= 10;
                digits++;
            }
            temp = i;
            while (temp>0) {                
                last = temp % 10; // We will get last digits through this
                sum += Math.pow(last, digits);
                temp /= 10;
            }
            if (i==sum) {
                System.out.print(i+"\t");
            }
        }
    }
}
