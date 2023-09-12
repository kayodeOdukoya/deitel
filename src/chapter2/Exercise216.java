package chapter2;
import java.util.Scanner;
public class Exercise216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first digit: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second digit: ");
        int num2 = scanner.nextInt();

        if (num1 > num2)
            System.out.printf("%d is greater than: %d%n", num1, num2);

        if (num1 < num2)
            System.out.printf("%d is less than: %d%n", num1, num2);

        else if(num1 == num2){
            System.out.printf("%d These numbers are equal %d%n", num1, num2);
        }

        else {

        System.out.printf("%d is not equal: %d%n", num1, num2);
        }


    }
}
