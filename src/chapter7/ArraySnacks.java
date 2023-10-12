package chapter7;

public class ArraySnacks {

    public static int theLargestNumber(int[] array) {
        int largest = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > largest) {
                largest = array[index];
            }
        }
        return largest;
    }


    public static int[] reverseList(int[] array) {
        int length = array.length;
        int[] reverse = new int[length];
        for (int index = 0; index < array.length; index++) {
            reverse[index] = array[length - 1 - index];

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

    public static int[] oddPosition(int[] number) {
        int[] odd = new int[number.length / 2];
        int oddNumber = 0;
        for (int count = 1; count < number.length; count += 2) {
            odd[oddNumber] = number[count];
            oddNumber++;
        }
        return odd;
    }
    public static int [] evenPositionElement(int[] number){
        int[] evenPosition = new int[number.length];
        if (number.length % 2 != 0){
            evenPosition = new int[number.length / 2 + 1];
        }else {
            evenPosition = new int[number.length / 2];
        }
        int index = 0;
        for (int count = 0; count < number.length; count += 2) {
            evenPosition[index] = number[count];
            index ++;

        }
        return evenPosition;
    }

    public static int sumOfForLoop(int[] array) {
        int sum = 0;
        int count;
        for (count = 0; count < array.length; count++) {
            sum = sum + array[count];
        }
        return sum;
    }

    public static int sumOfWhileLoop(int[] array) {
        int sum = 0;
        int count = 0;
        while (count < array.length) {
            sum += array[count];
            count++;
        }
        return sum;
    }

    public static int sumOfDoWhileLoop(int[] array) {
        int sum = 0;
        int count = 0;
        do {
            sum += array[count];
            count += 1;
        } while (count < array.length);
        return sum;
    }

    public static boolean Palindrome(String input) {
        int firstSide = 0, secondSide = input.length() - 1;
        while (firstSide < secondSide) {
            if (input.charAt(firstSide) != input.charAt(secondSide)) {
                return false;
            }
            firstSide++;
            secondSide--;
        }
        return true;
    }
    public static String [] concateateTwoLists(String[] letters, String[] number){
        String[] combine = new String[letters.length + number.length];
        int count = 0;
        for (int index = 0; index < letters.length; index++){
            combine[count] = letters[index];
            count ++;
        }
        for (int index = 0; index <number.length ; index++) {
            combine[count] = number[index];
            count ++;
        }
        return combine;

        }
}