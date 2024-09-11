package maxmin.max2;

import java.util.Scanner;

public class max2 {
    public static void main(String[] args) {
        System.out.println("The program finds the maximum of two numbers max(a, b).");
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double max = (a + b + Math.abs(a-b))/2;
        System.out.println(max);
        sc.close();
    }
}
