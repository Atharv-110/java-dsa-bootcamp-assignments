// Print the path so we can reach a particular cell in a maze/matrix. You can move right, down & diagonal too
package Recursion.Backtracking;

import java.util.ArrayList;

public class MazePathWithDiagonal {

    public static void main(String[] args) {
        System.out.println(returnPathDiagonal("", 3, 3));
    }

    private static ArrayList<String> returnPathDiagonal(String ans, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

//      For diagonal movement
        if (r > 1 && c > 1) {
            list.addAll(returnPathDiagonal(ans + "D", r - 1, c - 1));
        }

        if (r > 1) {
            list.addAll(returnPathDiagonal(ans + "V", r - 1, c));
        }
        
        if (c > 1) {
            list.addAll(returnPathDiagonal(ans+"H", r, c-1));
        }
        
        return list;
    }
}
