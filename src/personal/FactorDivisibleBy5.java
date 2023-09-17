package personal;

import java.util.Scanner;

public class FactorDivisibleBy5 { //But 0 should not be a factor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is number divisible by 5: ");
        int number = scanner.nextInt();

        if(number != 0 && number % 5 == 0) {
            System.out.println("factor");
        } else {
            System.out.println("Not a factor");
        }
    }
}
