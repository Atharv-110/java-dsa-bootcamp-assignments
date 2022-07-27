// Calculate Discount Of Product

package Conditional_Loops;

public class Discount {
    public static void main(String[] args) {
        double ori_price = 2999, discount_per = 25;
        double rate = discount_per / 100;
        double discount = ori_price * rate;
        double final_price = ori_price - discount;
        System.out.println("Discounted Price : "+final_price);
    }
}
