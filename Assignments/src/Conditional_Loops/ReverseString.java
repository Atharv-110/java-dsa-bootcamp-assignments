// Reverse A String In Java
package Conditional_Loops;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello", rstr = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            rstr += str.charAt(i);
        }
        System.out.println("Reverse : "+ rstr);
    }
}