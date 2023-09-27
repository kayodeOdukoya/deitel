package task;

import java.util.Scanner;

public class InputSumOfValidEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;
        int sum = 0;

        for (int index = 1; index <= numberOfScores; index++) {
            int score = 0;
             while ( score < 1 || score >= 100){
                System.out.print("Enter score " + index + ": ");
                score = scanner.nextInt();

            }

            sum += score;
        }

        System.out.println("Sum of the valid even scores is: " + sum);
        System.out.println();
    }

}
