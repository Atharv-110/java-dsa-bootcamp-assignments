// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package FirstJava;

import static java.lang.System.exit;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 nos : ");
        int num1 = sc.nextInt();    
        int num2 = sc.nextInt();
        int result = 0;
        System.out.print("Enter the operator : ");
        char op = sc.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            if (op == '+') {
                result = num1 + num2;
            }
            else if (op == '-') {
                result = num1 - num2;
            }
            else if (op == '*') {
                result = num1 * num2;
            }
            else if (op == '/') {
                if (num2 > 0) {
                    result = num1 / num2;
                }
            }
            else {
                System.out.println("Invalid Operation");
                exit(0);
            }
        }
        System.out.println("Answer is : "+ result);
        
    }
}
