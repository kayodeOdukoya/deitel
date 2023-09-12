package mrJonathanClass;

import java.util.Scanner;

public class MrJonathanClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = 1;
        int secondNumber =2;
        int thirdNumber =3;

        System.out.print("Enter first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        thirdNumber = scanner.nextInt();

        int fourthNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = fourthNumber;

        System.out.printf("firstNumber is: %s%n", firstNumber);
        System.out.printf("secondNumber is: %s%n", secondNumber);
        System.out.printf("thirdNumber is: %s%n", thirdNumber);

    }
}
