package evenOdd;

import java.util.Scanner;

public class Temporary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                printStars(factor);
            }
        }

        scanner.close();
    }

    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
