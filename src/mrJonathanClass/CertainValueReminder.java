package mrJonathanClass;

import java.util.Scanner;

public class CertainValueReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = scanner.nextInt();
        int result = value % 10;
        System.out.printf("the value is %d%n", result);

    }
}