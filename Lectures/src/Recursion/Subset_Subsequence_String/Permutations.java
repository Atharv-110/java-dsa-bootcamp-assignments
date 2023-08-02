// Program to find all the permutations of a given string 
package Recursion.Subset_Subsequence_String;

import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
//        printPermutation("", "abc");
        ArrayList<String> list = findPermutation("", "abc");
        System.out.println(list);
    }

    private static void printPermutation(String ans, String str) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            printPermutation(f + ch + s, str.substring(1));
        }
    }

//    return an arraylist of all the permutations
    private static ArrayList<String> findPermutation(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        
        char ch = str.charAt(0);
        
        ArrayList<String> store = new ArrayList<>();
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            store.addAll(findPermutation(f + ch + s, str.substring(1)));
        }
        return store;
    }
}
