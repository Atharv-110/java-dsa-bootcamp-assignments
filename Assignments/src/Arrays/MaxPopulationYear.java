// Maximum Population Year
// https://leetcode.com/problems/maximum-population-year/
package Arrays;


public class MaxPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs){
        //Optimised approach
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        
        //Running Sum Concept
        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i-1];
        }
        
        int maxVal = 0;
        int maxYear = 1950;
        
        for (int i = 0; i < 101; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        
        return maxYear;
    }
}
