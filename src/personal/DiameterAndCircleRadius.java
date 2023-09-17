package personal;

import java.util.Scanner;

public class DiameterAndCircleRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input radius of an integer: ");
        int radius = scanner.nextInt();
        double diameter = 2 * Math.PI;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("diameter: is %.2f%n", diameter);
        System.out.printf("circumference: is %.2f%n", circumference);
        System.out.printf("area: is %.2f%n", area);

    }
}
