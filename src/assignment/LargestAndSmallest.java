package assignment;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or type 100 to quit the process: ");
        int number = scanner.nextInt();
        int minimum = number;
        int largest = number;
        int index;

        for (index =1; number != 100; index++){
            System.out.print("Enter a number or type 100 to quit the process: ");
            number = scanner.nextInt();

            if (number < minimum && number != 100){
                 minimum = number;
            }
            if(number > largest && number != 100){
                number = largest;
            }
        }
            System.out.printf("minimum number is %d", minimum);
            System.out.printf("\nmaximum number is %d", largest);

    }
}
