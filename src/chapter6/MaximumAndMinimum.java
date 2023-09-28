package chapter6;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three floating numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("Maximum value is: " + result);

        double result2 = minimum(number1, number2, number3);
        System.out.println("Minumum value is: " + result2);
    }

    private static double maximum(double number1, double number2, double number3) {
        double maximum = number1;

        if (number2 > maximum) {
            maximum = number2;
        }
        if (number3 > maximum) {
            maximum = number3;
        }
        return maximum;
    }

    public static double minimum(double number1, double number2, double number3) {
        double minimum = number1;

        if (number2 < minimum) {
            minimum = number2;
        }
                if (number3 < minimum) {
                    minimum = number3;
                }
                return minimum;
    }
}