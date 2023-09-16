package chapter4;



public class Exercise430 {
    public static void main(String[] args) {

                int baseline = 10;

                if (baseline < 1 || baseline > 10) {

                } else {

                    for (int index = 1; index <= baseline; index++) {

                        for (int job = 1; job <= index; job++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }
        }

