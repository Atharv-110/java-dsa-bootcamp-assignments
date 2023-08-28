// Print the path so we can reach a particular cell in a maze/matrix

package Recursion.Backtracking;

import java.util.ArrayList;

public class MazePathDownRight {
    public static void main(String[] args) {
//        printPath("", 3, 3);
        System.out.println(returnPath("", 3, 3));
    }
    
//  Function which prints the answer within
    private static void printPath(String ans, int rows, int cols) {
        if (rows == 1 && cols == 1) {
            System.out.println(ans);
            return;
        }
        
        if (rows > 1) {
            printPath(ans + "D", rows-1, cols);
        }
        
        if (cols > 1) {
            printPath(ans + "R", rows, cols-1);
        }
    }
    
//  Function which returns answer in an ArrayList<String>
    private static ArrayList<String> returnPath(String ans, int rows, int cols){
        if (rows == 1 && cols == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        if (rows > 1) {
            list.addAll(returnPath(ans+"D", rows-1, cols));
        }
        
        if (cols > 1) {
            list.addAll(returnPath(ans+"R", rows, cols-1));
        }
        
        return list;
    }
}
