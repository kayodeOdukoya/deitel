package chapter2;

import java.util.Scanner;

public class Exercise228 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Radius of a circle: ");
        int radius = scanner.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("diameter: is %f%n", diameter);
        System.out.printf("circumference of a circle: is %f%n", circumference);
        System.out.printf("area is: %f%n", area);

    }
}
