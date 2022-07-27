// Calculate Depreciation of Value v2 = v1 * [1 - (r/100)]^t

package Conditional_Loops;

public class Depreciation {
    public static void main(String[] args) {
        double v1 = 200, r = 10, t = 2;
        double v2 = v1 * Math.pow((1 - (r/100)), t);
        System.out.println("Deprecitied Value : "+v2);
    }
}
