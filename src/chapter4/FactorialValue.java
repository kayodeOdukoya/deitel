package chapter4;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }

        System.out.printf("Factorial of %d is: %d%n", number, factorial);
    }
}
