package mrJonathanClass;

import java.util.Scanner;

public class SumOfVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int x = a - 10;
        int y = a + 10;
        int z = a % 10;

        int sum = a/(x * y * z);
        System.out.printf("the value of sum is: %d%n", sum);



    }
}
