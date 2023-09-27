package task;

import java.util.Scanner;

public class AverageOfValidScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;
        int sum = 0;

        for (int index = 1; index <= numberOfScores; index++) {
            int score = 0;
            while ( score < 1 || score >= 10){
                System.out.print("Enter score " + index + ": ");
                score = scanner.nextInt();

            }
            sum += score;
        }
        int average = sum / 10;
        System.out.println("average of the valid scores is: " + average);
        System.out.println();

    }
}
