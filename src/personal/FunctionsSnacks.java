package personal;

import assignment.Numerical;

public class FunctionsSnacks {

    public static boolean isEven(int number){
        boolean result = false;
        if (number % 2 == 0){
            result = true;
        }else if (number % 2 == 1){
            result = false;

            return false;
        }
        System.out.println(result);
        return result;

    }
    public static boolean isPrimeNumber(int number){
        if (number <= 2)
            return false;
        int count =0;
        for (count = 2; count < number; number += 1) ;
            if (number % count == 0) ;
                return false;
    }
    public static int subtract(int numberOne, int numberTwo){
        int result = 0;
        result = numberOne - numberTwo;
        return result;
    }

    public static int divide(int numberOne, int numberTwo) {
        int result = 0;
        result = numberOne / numberTwo;
        return result;
    }
    public static int factorOf(int number){
    int factor = 0;
        for (int count = 0; count < number; count++) {
            if (number % count == 0);
            factor += 1;
        }
        return factor;
    }
    public static int isSquare(int number){
        int result = 0;
        result = 0;
        result = number * number;
        return result;
    }
    public static int isPalindrome(int number){
        boolean result = false;
        int first = number / 10000;
        int second = number / 1000 % 10;
        int third = number / 100 % 10;
        int fourth = number / 10 % 10;
        int fifth = number % 10;

        if (first + second + third + fourth + fifth == fifth + fourth + third + second + fifth){
            result = true;
        }else result = false;
        return 0;
    }

     public static int factorialOf(int number){
        int factorial = 1;
         for (int count = 1; count <= number; count++) {
             factorial *= count;
         }
         System.out.println(factorial);
         return factorial;
     }
}
