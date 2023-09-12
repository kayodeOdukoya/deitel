package chapter4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int counter;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter a number: ");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;
        System.out.println(sum);
        System.out.print("Did you wish to quit? Enter 7 to do so: ");
        counter =scanner.nextInt();
        } while (counter != 7);
    }
}
