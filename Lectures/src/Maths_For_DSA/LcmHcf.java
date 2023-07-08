// Give 2 nums, Find HCF as well as LCM for them

package Maths_For_DSA;

public class LcmHcf {
    public static void main(String[] args) {
        int a = 3, b = 10;
        int gcd = hcf(a,b);
        int lcm = a * b / gcd;
        System.out.println("HCF : " + gcd);
        System.out.println("LCM : " + lcm);

    }

    private static int hcf(int a, int b) {
        if(a == 0) return b;
        return hcf(b%a, a);
    }
}
