package chapter2;

import java.util.Scanner;

public class Exercise225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//        if (number %3 ==0)
//            System.out.println("Number is divisible by 3");
//
//        if (number %3 != 0)
//            System.out.println("Number is not divisible by 3");


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number % 3 == 0){
            System.out.println("Its divisible by: 3");
        } else {
            System.out.println("Not divisible by 3: ");
        }









    }
}
