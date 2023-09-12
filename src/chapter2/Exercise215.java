package chapter2;

import java.util.Scanner;
public class Exercise215 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd integer: ");
        int num2 = scanner.nextInt();

        int square1 = num1 * num2;
        int square2 = num1 * num2;
        int square3 = square1 * square2;

        int sum = square1 + square2;
        int diff = square1 - square2;

        System.out.printf("the square1 is: %d%n", +square1);
        System.out.printf("the square3 is: %d%n", +square3);
        System.out.printf("the sum is: %d%n", +sum);
        System.out.printf("the diff is: %d%n", +diff);

    }
}
