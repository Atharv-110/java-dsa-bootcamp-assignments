/*
    Perimeter Of Circle (2 * 3.14 * radius)
    Perimeter Of Equilateral Triangle (3 * side)
    Perimeter Of Parallelogram (2 * (base + side))
    Perimeter Of Rectangle (2 * (length + breadth))
    Perimeter Of Square (4 * side)
    Perimeter Of Rhombus (4 * side)
*/
package Conditional_Loops;

public class PerimeterProgs {
    public static void main(String[] args) {
        double radii = 5, side = 10, base = 20, len = 30, bre = 40;
        System.out.println("Perimeter of Circle : "+ (2 * 3.14 * radii));
        System.out.println("Perimeter of Equilateral Triangle : "+(3 * side));
        System.out.println("Perimeter of Parallelogram : "+(2 * (base + side)));
        System.out.println("Perimeter of Rectangle : "+(2 * (len + bre)));
        System.out.println("Perimeter of Square : "+(4 * side));
        System.out.println("Perimeter of Rhombus : "+(4 * side));
    }
}
