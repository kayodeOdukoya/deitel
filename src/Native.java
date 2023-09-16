import java.util.Scanner;

public class Native {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int number2 = scanner.nextInt();



        int sum = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 / number2;
        int mod = number1 % number2;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);;
        System.out.println(div);
        System.out.println(mod);



    }
}
