package assignment;

import java.util.Scanner;

public class Count{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Enter a number and quit the program with 200: ");
        int value = scanner.nextInt();
        while (value !=200){
            System.out.print("Enter a number and quit the program with 200: ");
            value = scanner.nextInt();
            if(value >0){
                positive++;
            } else if (value < 0){
                negative--;
            } else {
                zero ++;
            }
        }
        System.out.printf("positive value is %d", positive);
        System.out.printf("\nnegative value is %d", negative);
        System.out.printf("\nzero value is %d", zero);
    }
}
