package rectangle;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        System.out.println("The program prints the perimeter and the square of a rectangle given the rectangle sides.");
        System.out.println("Enter the length and the breadth of the rectangle: ");
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Perimeter: " + 2*(l+b) + "\nSquare:" + l*b);
        sc.close();
    }   
}
