package task;

import java.util.Scanner;

public class TenScores {
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;

        int sum = 0;
        for (int index = 1; index <= numberOfScores; index++) {
            System.out.print("Enter the score" + index + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        System.out.println("Sum of the scores: " + sum);
        System.out.println();

    }
}
