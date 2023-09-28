package chapter7;

import java.util.Scanner;

public class ArrayTenScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int [] scores= new int [10];

        for (int count = 0; count <scores.length; count++) {
            System.out.println("Enter scores" + (count+1));
            scores [count] = scanner.nextInt();
         // scores[count]=score;
        }

        for (int i = 0; i <scores.length; i++) {
            total += scores[i];
        }

       double average = (double) total /scores.length;

        int minimum = scores[0];
        for (int i = 0; i <scores.length; i++) {
            if(scores[i] < minimum){
                minimum = scores[i];
            }
        }
        int maximum = scores[0];
        for (int i = 0; i <scores.length; i++) {
            if(scores[i] > maximum){
                maximum = scores[i];
            }
        }

        System.out.println("The  total is: " + total);
        System.out.println("The average is: " + average);
        System.out.println("the minimum is: " + minimum);
        System.out.println("the maximum is: " + maximum);

        }
}
