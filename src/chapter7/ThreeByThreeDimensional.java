package chapter7;

public class ThreeByThreeDimensional {
    public static void main(String[] args) {

        char [][] arrays = new char[3][3];

        arrays [0] [0] = 'x';
        arrays [0] [1] = '0';
        arrays [0] [2] = 'x';

        arrays [1] [0] = 'x';
        arrays [1] [1] = 'x';
        arrays [1] [2] = '0';

        arrays [2] [0] = '0';
        arrays [2] [1] = 'x';
        arrays [2] [2] = 'x';

        for (int count = 0; count <arrays.length; count++) {
            for (int index = 0; index <arrays[count].length ; index++) {
                System.out.print(arrays[count][index] + " | ");
            }
            System.out.println();

        }
    }
}
