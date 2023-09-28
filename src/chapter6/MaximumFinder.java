package chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three floating number by spaces: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: " + result);
    }

    public static double maximum(double number1, double number2, double number3) {
        double maximumValue = number1;
        double minimumValue = 0;

        if(number2 > maximumValue){
            maximumValue = number2;
        }
        if(number3 > maximumValue){
            maximumValue = number3;
        }
        if(number1 < maximumValue){
            minimumValue = number1;
        }
        if(number2 < maximumValue){
            minimumValue = number2;
        }
        if(number3 < minimumValue){
            minimumValue = number3;
        }
        return maximumValue;
    }
}
