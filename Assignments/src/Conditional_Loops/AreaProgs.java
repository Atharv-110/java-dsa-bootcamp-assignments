/*
    Area Of Circle Java Program (3.14 * radius * radius)
    Area Of Triangle (.5 * base * height)
    Area Of Rectangle Program (length * breadth)
    Area Of Isosceles Triangle 
    Area Of Parallelogram (base * height)
    Area Of Rhombus (diagonal1 * diagonal2 / 2)
    Area Of Equilateral Triangle (((3^1/2) * (a*a))/4)

*/
package Conditional_Loops;

public class AreaProgs {
    public static void main(String[] args) {
        double radius = 10, base = 20, height = 30, len = 10, bre = 20, d1 = 20, d2  = 30, side = 10;
        System.out.println("Area of Circle : "+ (3.14 * (Math.pow(radius, 2))));
        System.out.println("Area of Triagnle : "+ (0.5 * base * height));
        System.out.println("Area of Rectangle : "+ (len * bre));
        System.out.println("Area of Parallelogram : "+(base * height));
        System.out.println("Area of Rhombus : "+ (d1 * d2 * 0.5));
        System.out.println("Area of Equilateral Triangle : "+ (((Math.pow(3, 0.5)) * (Math.pow(side, 2)))/4));
    }
}
