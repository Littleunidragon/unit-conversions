package maxmin.max3;

import java.util.Scanner;

public class max3 {
    public static void main(String[] args) {
        System.out.println("The program finds the maximum of three numbers max(a, b, c)");
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double max2 = (a + b + Math.abs(a-b))/2;
        double max3 = (max2 + c + Math.abs(max2-c))/2;
        System.out.println(max3);
        sc.close();
    }
}
