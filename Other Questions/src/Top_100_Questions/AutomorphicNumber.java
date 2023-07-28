// To check whether the number is automorphic
package Top_100_Questions;

public class AutomorphicNumber {

    public static void main(String[] args) {
        System.out.println(checkAutomorphic(15));
    }

    private static boolean checkAutomorphic(int num) {
        int square = num * num;

        while (num != 0) {
            if (num % 10 != square % 10) {
                return false;
            }
            square /= 10;
            num /= 10;
        }
        return true;
    }
}
