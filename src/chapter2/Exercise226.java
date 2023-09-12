package chapter2;

import java.util.Scanner;

public class Exercise226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Input second integer: ");
        int secondInteger = input.nextInt();

        int firstTripled = firstInteger * 3;
        int secondDoubled = secondInteger *2;

        boolean multiple = (firstTripled % secondDoubled == 0);
        //System.out.println("Triple first number: " + firstTripled);
       // System.out.println("double second number: " + secondDoubled);

        if(multiple){
            System.out.println("The first number is tripled of the second number");
        } else {
            System.out.println("The first number is not tripled the second number");
        }


    }
}
