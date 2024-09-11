package circle;

import java.util.Scanner;

public class circle {
 public static void main(String[] args) {
    System.out.println("The program prints the perimeter and the square of a circle given the radius.");
    System.out.println("Enter the radius:");
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    double prm = 2 * (Math.PI * r);
    double sqr = Math.PI * r * r;
    System.out.println("Perimeter: " + prm);
    System.out.println("Square: " + sqr);
 }
    
}