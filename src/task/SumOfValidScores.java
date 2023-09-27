package task;

import java.util.Scanner;

public class SumOfValidScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;
        int sum = 0;
        for (int index = 1; index <= numberOfScores; index++) {
            System.out.print("Enter valid scores" + index + ": ");
            int score = scanner.nextInt();
            if (index % 2 == 1) {
                sum += index;
            }
        }

        System.out.println("Sum of the valid scores is: " + sum);
        System.out.println();
    }

}
