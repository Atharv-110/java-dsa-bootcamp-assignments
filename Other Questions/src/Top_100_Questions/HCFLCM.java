// To find LCM and HCF of two numbers

package Top_100_Questions;

public class HCFLCM {
    public static void main(String[] args) {
        int a = 3, b = 10;
        int hcf = hcf(a, b);
        System.out.println("HCF : "+hcf);
        int lcm = a * b / hcf;
        System.out.println("LCM : "+lcm);
    }
    
    private static int hcf(int a, int b) {
        if (a == 0) {
            return b;
        }
        
        return hcf(b%a, a);
    }
}
