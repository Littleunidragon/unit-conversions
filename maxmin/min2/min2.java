package maxmin.min2;

import java.util.Scanner;

public class min2 {
    public static void main(String[] args) {
        System.out.println("The program finds the minimum of two numbers min(a, b)");
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double min = (a + b - Math.abs(a-b))/2;
        System.out.println(min);
        sc.close();
    }
}
