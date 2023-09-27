package task;

 public class SumOfEvenNumbers {
        public static void main(String[] args) {
            int sum = 0;
            for (int index = 1; index <= 10; index++) {
                if (index % 2 == 0) {
                    sum += index;
                }
            }

            System.out.println("Sum of even numbers between 1 and 10 is: " + sum);
        }
}
