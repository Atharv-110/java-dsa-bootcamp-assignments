// Input currency in rupees and output in USD.
package FirstJava;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency in ruppes : ");
        float rupee = sc.nextFloat();
        float dollar = (float)(rupee / 79.80);
        System.out.println("Rupee into dollar : "+ dollar);    
    }
    
}
