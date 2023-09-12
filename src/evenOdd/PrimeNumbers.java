package evenOdd;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int noOffactor = 0;

        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                noOffactor++;
            }
        }

        if(noOffactor == 2){
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }

    }
}