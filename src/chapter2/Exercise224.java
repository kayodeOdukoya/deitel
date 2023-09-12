package chapter2;

import java.util.Scanner;

public class Exercise224 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        System.out.print("Enter 1st integer: ");
//        int number1 = input.nextInt();
//        System.out.print("Enter 2nd integer: ");
//        int number2 = input.nextInt();
//        System.out.print("Enter 3rd integer: ");
//        int number3 = input.nextInt();
//        System.out.print("Enter 4th integer: ");
//        int number4 = input.nextInt();
//        System.out.print("Enter 5th integer: ");
//        int number5 = input.nextInt();
//
//
//        if(number1 > number2 && number1> number3 && number1 > number4 && number1 > number5);
//        System.out.printf("the highest is %d%n", number1);
//
//        if(number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5);
//        System.out.printf("the highest is %d%n", number2);
//
//        if(number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5);
//        System.out.printf("the highest is %d%n", number3);
//
//        if(number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5);
//        System.out.printf("the highest is %d%n", number4);
//
//        if(number5 > number1 && number5 > number2 && number5 > number3 && number5 >number4);
//        System.out.printf("the highest is %d%n", number5);
//
//
//
//        if(number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5);
//        System.out.printf("the lowest is %d%n", number1);
//
//        if(number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5);
//        System.out.printf("the lowest is %d%n", number2);
//
//        if(number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5);
//        System.out.printf("the lowest is %d%n", number3);
//
//        if(number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5);
//        System.out.printf("the lowest is %d%n", number4);
//
//        if(number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4);
//        System.out.printf("the lowest is %d%n", number5);






//        int num1;
//        int num2;
//        int num3;
//        int num4;
//        int num5;
//        int smallest;
//        int largest;
//
//        System.out.print("Enter first integer: ");
//        num1 = input.nextInt();
//
//        System.out.print("Enter second integer: ");
//        num2 = input.nextInt();
//
//        System.out.print("Enter third integer: ");
//        num3 = input.nextInt();
//
//        System.out.print("Enter fourth integer: ");
//        num4 = input.nextInt();
//
//        System.out.print("Enter fifth integer: ");
//        num5 = input.nextInt();
//
//
//
//        smallest = num1;
//
//        if (num2 <= smallest)
//            smallest = num2;
//
//
//        if (num3 <= smallest)
//            smallest = num3;
//
//        if (num4 <= smallest)
//            smallest = num4;
//
//        if (num5 <= smallest)
//            smallest = num5;
//
//
//        largest = num1;
//
//        if (num2 >= largest)
//            largest = num2;
//
//        if (num3 >= largest)
//            largest = num3;
//
//        if (num4 >= largest)
//            largest = num4;
//
//        if (num5 >= largest)
//            largest = num5;
//
//
//        System.out.printf("Small is %d%n", smallest);
//        System.out.printf("Largest is %d%n", largest);

            int largest;
            int lowest;

        System.out.print("Enter 1st integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter 2nd integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter 3rd integer: ");
        int number3 = input.nextInt();

        System.out.print("Enter 4th integer: ");
        int number4 = input.nextInt();

        System.out.print("Enter 5th integer: ");
        int number5 = input.nextInt();

        largest = number1;

//        if(number1 >= largest){
//            largest = number1;
//        }
        if(number2 >=largest){
            largest = number2;
        }
        if(number3 >= largest){
            largest = number3;
        }
        if(number4 >= largest){
            largest = number4;
        }
        if (number5 >= largest){
            largest = number5;
        }

        lowest = number1;

        if(number2 <= lowest){
            lowest = number2;
        }
        if(number3 <=lowest){
            lowest = number3;
        }
        if(number4 <= lowest){
            lowest = number4;
        }
        if(number5 <= lowest){
            lowest = number5;
        }


        System.out.printf("The largest is: %d%n", largest);
        System.out.printf("The lowest is: %d%n", lowest);
    }
}
