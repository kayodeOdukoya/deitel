package pseudocode;




// Collect user input
// Check user input
//      if user input between 90 to 100 print ("A");
//      if user input between 80 to 89 print ("B");
//      if user input between 70 to 79 print ("C");
//      if user input between 60 to 69 print ("D");
//      if user input is less than 60 print ("F");



import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student score: ");
        int score = scanner.nextInt();

        if (score <= 100) {
            System.out.println("A");
        }

        if (score <= 89) {
            System.out.println("B");
        }

        if (score <= 79) {
            System.out.println("C");
        }

        if (score <= 69) {
            System.out.printf("Score is %s", "D");
        }

        if (score <= 60) {
            System.out.printf("Score is %s", "F");
        }
    }
}
