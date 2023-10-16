package chapter7;

import java.util.Arrays;

public class MinMax {

        public static void main(String[] args) {
                System.out.println(Arrays.toString(new int[]{sum(new int[]{5, 3, 4, 1, 2})}));
        }
public static int maximum(int[] numbers){
  int maximum = numbers[0];
        for (int index = 0; index < numbers.length ; index++) {
                if (index > maximum){
                        maximum = numbers[index];
                }
        }
        return maximum;
        }
public static int minimum(int[] numbers){
   int minimum = numbers[0];
        for (int count = 0; count < numbers.length ; count++) {
                if (count < minimum){
                        minimum = numbers[count];
                }
        }
        return minimum;
}
public static int sum(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
         total += i;
        }
        return total;
}
public static int[] sumOfMinMax(int[] numbers){
        int maximum = sum(numbers) - maximum(numbers);
        int minimum = sum(numbers) - minimum(numbers);
        return new int[]{maximum , minimum};
}
}



