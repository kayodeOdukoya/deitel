package chapter4;



public class FourPatternsLoops {
    public static void main(String[] args) {

        System.out.println("\n\nPattern A");
        for (int index = 1; index <= 6 ; index++) {

            for (int index1 = 1; index1 <= 6; index1++) {
                System.out.println(index1 + " ");

            }
            System.out.println();
        }
        System.out.println("\n\nPattern B");
        for (int index = 1; index <= 6 ; index++) {

            for (int index1 = 1; index1 <= 6; index1++) {
                System.out.println(index1 + " ");

            }
            System.out.println();
        }
        System.out.println("\n\nPattern C");
        for (int index = 1; index <= 6 ; index++) {

            for (int index1 = 1; index1 <= 5; index1++) {
                System.out.println(index1 + " ");

            }
            System.out.println();
        }

        System.out.println("\n\nPattern D");
        for (int index = 1; index <= 6 ; index++) {

            for (int index1 = 1; index1 <= 4; index1++) {
                System.out.println(index1 + " ");

            }
            System.out.println();
        }
    }
}
