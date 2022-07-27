// Calculate Average Marks

package Conditional_Loops;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of all 5 subjects out of 100 : ");
        int[] marks = new int[5];
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
//        System.out.println(sum);
        float avg = (float)(sum / marks.length);
        System.out.println("Average of total is : "+avg);
    }
}
