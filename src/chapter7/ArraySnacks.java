package chapter7;

public class ArraySnacks {

        public static int theLargestNumber(int[] array) {
            int largest = array[0];
            for (int index = 1; index < array.length; index++) {
                if (array[index]> largest){
                    largest = array[index];
                }
            }
            return largest;
        }


    public static int[] reverseList(int[] array) {
        int length = array.length;
        int [] reverse = new int[length];
        for (int index = 0; index < array.length; index++) {
            reverse[index] = array[length-1-index];

        }
        return reverse;
    }

    public static boolean checkElement(int[] array, int value) {
        boolean check = false;
        for (int element : array) {
            if (element == value) {
                check = true;
                break;
            }
        }
        return check;
    }


    public static int sumOfForLoop(int[] array, int total) {
        int sum = 0;
        int count;
        for (count = 0; count < total; count++) {
            sum = sum + array[count];
        }
        return sum;
    }
    public static int sumWhileLoop(int[] array, int total) {
        int sum = 0;
        int count = 0;
        while (count < total) {
            sum += array[count];
            count++;
        }
        return sum;
    }
    public static int sumDoWhileLoop(int[] myArray, int total) {
        int sum = 0;
        int count = 0;
        do {
            sum += myArray[count];
            count += 1;
        } while (count < total);
        return sum;
    }

}