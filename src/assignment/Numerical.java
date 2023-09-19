package assignment;

public class Numerical {

    public boolean isEven(int number){
        boolean result = false;
        if(number % 2 == 0){
            result = true;
        } else if (number % 2 == 1) {
            result = false;

        }
        System.out.println(result);
        return result;
    }
    public boolean  isPrimeNumber(int number){
        if(number <= 2)
            return false;
        int count;
        for (count = 2; count < number; count++)
            if(number % count == 0)
                return false;
        return true;
    }
    public int subtraction(int numberOne, int numberTwo){
        int result = 0;
        if(numberOne>numberTwo){
            result = numberOne - numberTwo;
        }else if(numberTwo > numberOne){
            result = (numberTwo - numberOne);
            result = Math.abs(result);
        }
        return result;
    }
    public float divide(int numberOne, int numberTwo){
        int result =0;
        result = numberOne / numberTwo;
        return result;
    }
    public int factorOf(int number){
        int factor = 0;
        for(int count = 1; count <= number; count++){
            if(number % count == 0) factor = factor +1;
        }
        System.out.println(factor);

        return factor;
    }
    public int isSquare(int number){
        int result = 0;
        result = number * number;
        return result;
    }
    public int isPalindrome(int number){
        boolean result = false;

        int first = number / 10000;
        int second = number / 1000 % 10;
        int third = number / 100 % 10;
        int fourth = number / 10 % 10;
        int fifth = number % 10;

        if(first + second + third + fourth + fifth == fifth + fourth + third + second + first){
            result = true;
        }else result = false;
        return  0;
    }
    public int factorialOf(int number){
        int factorial= 1;
        for (int count=1; count <= number; count +=1){
            factorial *= count;
        } return factorial;
    }

}
