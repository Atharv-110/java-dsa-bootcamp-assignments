// Find the factors of a number

package Top_100_Questions;

public class FactorsOfNum {
    public static void main(String[] args) {
        findAllFactors(100);
    }
    
//  Iterative Method
    private static void findAllFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
