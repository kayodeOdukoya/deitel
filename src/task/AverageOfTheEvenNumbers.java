package task;

import java.util.Scanner;

public class AverageOfTheEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScores = 10;
        int sum = 0;
        for (int index = 1; index <= numberOfScores; index++) {
            System.out.print("Enter the scores" + index + ": ");
            int score = scanner.nextInt();
            if (index % 2 == 0) {
                sum += index;
            }
        }
        int average = sum / 10;

        System.out.println("Average of the scores: " + average);
        System.out.println();
    }
}
