// Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/

package Strings.Easy;

public class DefangIPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPAddr("1.1.1.1"));
    }
    
    public static String defangIPAddr(String address) {
        String ans = address.replace(".", "[.]");
        return ans;
    }
}
