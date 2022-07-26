/*
    Volume Of Cone Java Program ((1/3)* 3.14 * radius * radius * height)
    Volume Of Prism (base * height * length * 0.5)
    Volume Of Cylinder (3.14 * radius * radius * height)
    Volume Of Sphere ((4/3) * 3.14 * radius^3)
    Volume Of Pyramid ((1/3) * length * width * height)
 */
package Conditional_Loops;

public class VolumeProgs {
    public static void main(String[] args) {
        double radii = 5, base = 10, height = 15, length = 20, width = 25;
        System.out.println("Volume of Cone : "+ ((1/3) * 3.14 * Math.pow(radii, 2) * height));
        System.out.println("Volume of Prism : "+ (base * height * length * 0.5));
        System.out.println("Volume of Cylinder : "+ (3.14 * Math.pow(radii, 2) * height));
        System.out.println("Volume of Sphere : "+ ((4/3) * 3.14 * Math.pow(radii, 3)));
        System.out.println("Volume of Pyramid : "+ ((length * width * height) / 3));
    }
}
