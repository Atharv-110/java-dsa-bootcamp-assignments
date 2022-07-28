// Future Investment Value = present value * (1 + interest rate)^n

package Conditional_Loops;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        double pv = 1000, ir =10, t = 5;
        double fv = pv * Math.pow((1 + (ir/100)), t);
        System.out.println("Future Investment Value = "+fv);
    }
}
