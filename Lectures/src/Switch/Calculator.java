// Calculator using If and Switch Statements

package Switch;

import static java.lang.System.exit;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        char op;
        while (true) {            
            System.out.print("Enter an Operator : ");
            op = sc.next().trim().charAt(0);
            switch (op) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                    System.out.print("Enter 2 nums : ");
                    double n1 = sc.nextDouble(), n2 = sc.nextDouble();
                    switch (op) {
                        case '+' -> ans = sum(n1,n2);
                        case '-' -> ans = substract(n1,n2);
                        case '*' -> ans = mul(n1,n2);
                        case '/' -> ans = div(n1,n2);
                        case '%' -> ans = Modulo(n1,n2);
                    }
                    break;
                 case 'x':
                    System.out.print("Are you sure, Enter y/Y if you want to exit : ");
                    char s = sc.next().trim().charAt(0);
                    if (s == 'y' || s == 'Y') {
                        System.out.println("Quiting...");
                        exit(0);
                    }
                    else {
                        break;
                    }
                default:
                    System.out.println("Enter valid operator");
            }
            System.out.println("Answer : "+ans);
        }
    }

    static double sum(double n1, double n2) {
        return n1 + n2;
    }

    static double substract(double n1, double n2) {
        return n1 - n2;
    }

    static double mul(double n1, double n2) {
        return n1 * n2;
    }

    static double div(double n1, double n2) {
        return (float)(n1 / n2);
    }

    static double Modulo(double n1, double n2) {
        return n1 % n2;
    }
}
