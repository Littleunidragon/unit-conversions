package quadratic;

import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        System.out.println("The program finds solutions of a quadratic equation");
        System.out.println("Enter the coefficients A, B and C: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a == 0){
            System.out.println("This is linear equation!");
            if (b!=0){
                System.out.println("x = " + (-c/b));
            } else {
                System.out.println("No root!");
            }
        } else {
            double d = b*b - 4 * a * c;
            if (d>0) {
                double x1 = (-b+Math.sqrt(d))/2*a;
                double x2 = (-b-Math.sqrt(d))/2*a;
                System.out.println("x1 = " + x1 +" \nx2 = " + x2);
            } 
            else if (d == 0) {
                double x = (-b+Math.sqrt(d))/2*a;
                System.out.println("x = " + x);
            } else {
                System.out.println("No root!");
            }
        }
        sc.close();
    }
}
