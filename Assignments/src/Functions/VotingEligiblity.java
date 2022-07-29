// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

package Functions;

import java.util.Scanner;

public class VotingEligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Person's age : ");
        int age = sc.nextInt();
        if (vote(age)) {
            System.out.println("Person is eligible to vote!");
        }
        else {
            System.out.println("Person is not eligible to vote!");
        }
    }

    static boolean vote(int age) {
        return age >= 18;
    }
}
