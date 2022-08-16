// Cells with odd values in a matrix
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

package Arrays;

public class OddValuesMatrix {
    public static void main(String[] args) {
        int[][] indices = {
                    {1,1},
                    {0,0}
                    };
        int m = 2, n = 2;
        System.out.println(oddCells(indices, m, n));
    }

    static int oddCells(int[][] indices, int m, int n) {
        int[][] arr = new int[m][n];
//      Set all the values of array to 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < indices.length; i++) {
            for (int r = 0; r < m; r++) {
                arr[r][indices[i][1]]++;
            }
            for (int c = 0; c < n; c++) {
                arr[indices[i][0]][c]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
