package chapter2;


public class Exercise231 {
    public static void main(String[] args) {

        System.out.println("number |square |cube");

        for(int number = 0; number <= 10; number++){
            int square = number * number;
            int cube = number * number * number;

            System.out.printf("%d\t%d\t%d%n", number, square, cube);

        }


    }
}

