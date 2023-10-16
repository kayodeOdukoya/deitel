package chapter7;

public class ArrayOddEvenStatic {

    public static int getOddPosition(int [] array){
        int sum = 0;
        for (int i = 1; i < array.length; i+=2) {
            sum += (array[i]);
        }
        return sum;
    }
    public static int getEvenPosition(int [] array){
        int total = 0;
        for (int i = 0; i < array.length; i+= 2) {
            total +=(array[i]);
        }
        return total;
    }
    public static int addOddPosition(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i+=1) {
            if (array[i] % 2 == 1){
                sum += (array[i]);
            }

        }
        return sum;
    }
    public static int addEvenPosition(int [] array){
        int total = 0;
        for (int i = 0; i < array.length; i+= 1) {
           if (array[i] % 2 == 0){
               total += array[i];
           }
        }
        return total;
    }

}
