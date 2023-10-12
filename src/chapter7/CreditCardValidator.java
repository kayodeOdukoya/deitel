package chapter7;

import java.util.Scanner;

public class CreditCardValidator {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int CardCheckerTwo = 0;
        int cardNumberLength;

        System.out.println("Welcome, kindly input card detais for verification: ");
        String cardNumber = scanner.nextLine();
        int length = cardNumber.length();
        while (length < 13 || length > 16){
            cardNumber = scanner.nextLine();
            length = cardNumber.length();
        }
        if (length >= 13 && length <= 16){
            System.out.println("********************************");
            System.out.print("*Credit Card Type: ");
            checkCardType(cardNumber);
            System.out.println("*Credit card Number: " + cardNumber);
            System.out.println("*Credit card Number: " + length);
            System.out.println("*Credit card Validity Status: ");
            checkCard(cardNumber);
            System.out.println("*********************************");

        }

    }

    public static void checkCard(String numbers){
        int result = 0;
        if (result % 10 == 0){
            System.out.println("Valid card number");
        }else {
            System.out.println("Invalid card number");
        }
    }
    public static void checkCardType(String creditCardNo){
        String card  = " ";

        String firstNumber = String.valueOf(creditCardNo.charAt(0));
        String secondNumber = String.valueOf(creditCardNo.charAt(1));
        if (firstNumber.equals("4")) {
            card = "Visa card";
        }else if (firstNumber.equals(5)){
            card = "Master card";
        } else if (firstNumber.equals("3") && secondNumber.equals("7")) {
            card = "American Express Cards";
        }else {
            card = "Invalid card";
        }
        System.out.println(card);

    }

    public static int checkCreditNumber(String numbers){
        char single = ' ';
        String letters = " ";
        int figure = 0;
        int product = 2;
        int sum = 0;
        int length = numbers.length()-1;
        for (int index = length-1; index >=0; index-=2) {

            single = numbers.charAt(index);
            letters = String.valueOf(single);
            figure = Integer.parseInt(letters);

            int multiple = product * figure;
            if (multiple > 9){
                int firstNumber = multiple / 10;
                int secondNumber = multiple % 10;
                multiple = firstNumber + secondNumber;
            }
            sum += multiple;
        }
        return sum;
    }
    public static int secondCardNumber(String numbers){
        char single = ' ';
        String letters = " ";
        int number = 0;
        int sum = 0;
        int length = numbers.length();
        for (int index = length - 1; index >=0 ; index-=2) {
            single = numbers.charAt(index);
            letters = String.valueOf(single);
            number = Integer.parseInt(letters);

            sum += number;
        }
        return sum;
    }

    public static int sum(String numbers){
        int sum = 0;
        int firstTotal = 0;
        int secondTotal = 0;

        firstTotal = checkCreditNumber(numbers);
        secondTotal = secondCardNumber(numbers);
        sum = firstTotal + secondTotal;
        return sum;
    }
}
