package chapter7;

public class EnhanceForLoop {
//    public static void main(String[] args) {
//        int[][] items1 = {{34, 23, 65}, {23, 67, 44, 68}};
//        for (int[] iterate:items1){
//            System.out.println();
//            for (int item : iterate){
//                System.out.print(item+"       ");
//
//            }
//        }
//    }


        public static void main(String[] args) {
            int[][] items={{34,23,65},{23,67,44,68}};
            for (int [] iterate: items){
                for (int item:iterate){

                    System.out.printf("%d\t  ",item);
                }
                System.out.println();
            }
        }


}

