package chapter4;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (counter!=10){
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            sum += number;
            counter++;
        }
        System.out.println(sum);
    }
}
