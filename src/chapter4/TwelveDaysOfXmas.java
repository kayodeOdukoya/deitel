package chapter4;

public class TwelveDaysOfXmas {
    public static void main(String[] args) {

        for (int day = 1; day <= 12; day++){
            System.out.print("on the " + day);

            switch (day){
                case 1:
                    System.out.print("st day of Christmas ");
                    break;
                case 2:
                    System.out.print("nd day second day of Christmas ");
                    break;
                case 3:
                    System.out.print("rd day third day of Christmas ");
                    break;
                default:
                    System.out.print("th day twelfth day of Christmas");
            }

            switch (day){
                case 12 -> {
                    System.out.println("My true love gave to me, Twelve drummers drumming\n, Eleven pipers piping\n, Ten lords a-leaping\n, Nine ladies dancing\n, Eight maids a-milking\n, Seven swans a-swimming\n, Six geese a-laying\n, Five golden rings\n, Four calling birds\n, Three French hens\n, Two turtle doves\n, And a partridge in a pear tree\n. ");
                }
                case 11 -> {
                    System.out.println("My true love gave to me, Eleven pipers piping\n, Ten lords a-leaping\n, Nine ladies dancing\n, Eight maids a-milking\n, Seven swans a-swimming\n, Six geese a-laying\n, Five golden rings\n, Four calling birds\n, Three French hens\n, Two turtle doves\n, And a partridge in a pear tree. ");
                }
                case 10 -> {
                    System.out.println("My true love sent to me, Three french hens, A partridge in a pear tree");
                }
                case 9 -> {
                    System.out.println("My true love sent to me, Four calling birds, A partridge in a pear tree");
                }
                case 8 -> {
                    System.out.println("My true love sent to me, Five golden rings, A partridge in a pear tree");
                }
                case 7 -> {
                    System.out.println("My true love sent to me, Six gees a laying, A partridge in a pear tree");
                }
                case 6 -> {
                    System.out.println("My true love sent to me, Seven swans a swimming, A partridge in a pear tree");
                }
                case 5 -> {
                    System.out.println("My true love sent to me, Five golden rings\n, Four calling birds\n, Three French hens\n, Two turtle doves\n, And a partridge in a pear tree.");
                }
                case 4 -> {
                    System.out.println("My true love sent to me, Four calling birds\n, Three French hens\n,Two turtle doves\n, And a partridge in a pear tree.");
                }
                case 3 -> {
                    System.out.println("My true love sent to me, Four calling birds\n, Three French hens\n, Two turtle doves\n, And a partridge in a pear tree");
                }
                case 2 -> {
                    System.out.println("My true love sent to me, Two turtle doves\n, And a partridge in a pear tree");
                }
                case 1 -> {
                    System.out.println("My true love sent to me\n, A partridge in a pear tree.");
                }

            }
            System.out.println();
        }
    }
}
