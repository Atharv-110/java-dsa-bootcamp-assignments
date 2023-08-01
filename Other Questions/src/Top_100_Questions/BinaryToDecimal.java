// Write a program to convert binary number to decimal number

package Top_100_Questions;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(decimalConversion(101100001));
    }
    
    private static int decimalConversion(int binary) {
        int decimal = 0, n = 0;
        while (binary > 0) {            
            int rem = binary%10;
            decimal += (int)rem*Math.pow(2, n);
            binary /= 10;
            n++;
        }
        return decimal;
    }
}
