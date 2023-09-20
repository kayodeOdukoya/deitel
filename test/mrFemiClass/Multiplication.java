package mrFemiClass;

public class Multiplication {

    public static int multiplication(int firstNumber, int secondNumber) {
        int result = 0;
        if(firstNumber<0)
            firstNumber =- firstNumber;
        if(secondNumber<0)
            secondNumber =- secondNumber;

        for(int count= firstNumber; count >= 1; count--){
            result += secondNumber;
        }
        return result;
    }
}
