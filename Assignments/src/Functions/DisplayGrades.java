// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
// https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html
package Functions;

import java.util.Scanner;

public class DisplayGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        float total = 0;
        System.out.print("Enter marks of each subject of the student out of 100 : ");
        for (int i = 0; i < marks.length; i++) {
            total += sc.nextFloat();
        }
        System.out.println("Total Marks : "+total);
        float per  = percent(total);
        System.out.println("Percentage : "+per);
        String grade = calGrade(per);
        System.out.println("Grade : "+grade);
    }

    static float percent(float total) {
        return (total/500) * 100;
    }

    static String calGrade(float per) {
        if (per >= 91 && per <= 100) {
            return "AA";
        }
        else if (per >= 81 && per <= 90) {
            return "AB";
        }
        else if (per >= 71 && per <= 80){
            return "BB";
        }
        else if (per >= 61 && per <= 70) {
            return "BC";
        }
        else if (per >= 51 && per <= 60) {
            return "CD";
        }
        else if (per >= 41 && per <= 50) {
            return "DD";
        }
        else if (per >= 0 && per <= 40) {
            return "Fail";
        }
        
        return "Result Cant be Calculated";
    }
}
