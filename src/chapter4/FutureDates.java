package chapter4;

import java.util.Scanner;

public class FutureDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter todays\'s day of the week: ");
        int today = scanner.nextInt();

        System.out.print("Enter days of the future: ");
        int future = scanner.nextInt();

            int result = today + future % 7;

            switch (today) {
                case 0:
                    System.out.print(" today is Sunday ");
                    break;
                case 1:
                    System.out.print(" today is Monday ");
                    break;
                case 2:
                    System.out.print(" today is Tuesday ");
                    break;
                case 3:
                    System.out.print(" today is Wednesday ");
                    break;
                case 4:
                    System.out.print(" today is Thursday ");
                    break;
                case 5:
                    System.out.print(" today is Friday ");
                    break;
                case 6:
                    System.out.print(" today is Saturday ");
                default:
                    System.out.println(" Frankly Not available ");
            }


            switch (result){
                case 0:
                    System.out.print(" the future day is Sunday ");
                    break;
                case 1:
                    System.out.print(" future day is Monday ");
                    break;
                case 2:
                    System.out.print(" future day is Tuesday ");
                    break;
                case 3:
                    System.out.print(" future day is Wednesdday ");
                    break;
                case 4:
                    System.out.print(" future day is Thursday ");
                    break;
                case 5:
                    System.out.print(" future day is Friday ");
                    break;
                case 6:
                    System.out.print(" future day is Saturday ");
                    break;
                default:
                    System.out.println(" Aboki, not available on this planet ");
            }

    }
}
