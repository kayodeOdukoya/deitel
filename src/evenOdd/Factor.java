package evenOdd;

import java.util.Scanner;

public class Factor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int factor = 0;

        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                factor++;
            }
        }
            System.out.println("number of factors of " + number +' '+"is:"+' ' + factor);


    }
}

