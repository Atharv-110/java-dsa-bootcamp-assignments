// Letters combinations of a Phone Number
package Recursion.Google_Amazon;

import java.util.ArrayList;

public class PhoneNumber {

    public static void main(String[] args) {
        System.out.println(letterCombFunRet("", "12"));
//        letterCombFun("", "12");
    }

//  Function that will just print the answer no returning
    private static void letterCombFun(String ans, String str) {
//      Base Condition is that if the string which is unprocessed gets empty upon numerous recursive calls then this will start printing processed string of the particular recursive call
        if (str.isEmpty()) {
            System.out.print(ans + ", ");
            return;
        }

        int digit = str.charAt(0) - '0';
//      For any digit in numpad:
//      range is from (digit-1)*3 to digit*3(exclusive) 
//      eg: if numpad digit is 2 then letter range will be from (2-1)*3 i.e. 3 to 2*3 i.e. 6(exclusive)

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            letterCombFun(ans + ch, str.substring(1));
        }
    }

//  Function which will return the ArrayList<String> with all the answers
    private static ArrayList<String> letterCombFunRet(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = str.charAt(0) - '0';
        ArrayList<String> listAll = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            listAll.addAll(letterCombFunRet(ans + ch, str.substring(1)));
        }
        return listAll;
    }
}
