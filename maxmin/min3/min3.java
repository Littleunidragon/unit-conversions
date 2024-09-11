package maxmin.min3;

import java.util.Scanner;

public class min3 {
    public static void main(String[] args) {
        System.out.println("The program finds the minimum of three numbers min(a, b, c)");
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double min2 = (a + b - Math.abs(a-b))/2;
        double min3 = (min2 + c - Math.abs(min2-c))/2;
        System.out.println(min3);
        sc.close();
    }
}
