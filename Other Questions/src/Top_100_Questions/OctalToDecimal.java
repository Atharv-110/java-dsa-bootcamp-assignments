// Program to convert a number in octal number system into decimal number system
package Top_100_Questions;

public class OctalToDecimal {

    public static void main(String[] args) {
        System.out.println(octalConversion(512));
    }

    private static int octalConversion(int octal) {
        int decimal = 0, n = 0;
        while (octal > 0) {
            int rem = octal % 10;
            decimal += rem * Math.pow(8, n);
            octal /= 10;
            n++;
        }
        return decimal;
    }
}
