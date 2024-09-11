package resistance;

import java.util.Scanner;

public class resistance {
    public static void main(String[] args) {
        System.out.println("The program calculates the resistance R of two resistors.");
        System.out.println("Enter the resistance of two resistors: ");
        Scanner sc = new Scanner(System.in);
        double R1 = sc.nextDouble();
        double R2 = sc.nextDouble();
        System.out.println("Resistance when connected in series is " + (R1 +R2));
        System.out.println("Resistance when connected in parallel is " + (R1 * R2) / (R1 + R2));
        sc.close();
    }
}
