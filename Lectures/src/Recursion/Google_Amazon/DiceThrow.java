// Dice Throw - Amazon
// Achieve "4" or a target number by the combination of dots present in the dice
package Recursion.Google_Amazon;

import java.util.ArrayList;

public class DiceThrow {

    public static void main(String[] args) {
//        diceThrow("", 4);
        System.out.println(diceThrowRet("", 4));

    }

//  Function with printing and no returning
    private static void diceThrow(String ans, int target) {
        if (target == 0) {
            System.out.print(ans + ", ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceThrow(ans + i, target - i);
        }
    }

//  Function with returning of ArrayList<String>
    private static ArrayList<String> diceThrowRet(String ans, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=6 && i<=target; i++) {
            list.addAll(diceThrowRet(ans+i, target-i));
        }
        return list;
    }
}
