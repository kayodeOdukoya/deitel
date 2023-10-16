//package chapter7;
//
//import com.google.common.base.MoreObjects;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CheckOutApp {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> ProductName  =  new ArrayList<>();
//        ArrayList<Integer>  quantity = new ArrayList<>();
//        ArrayList<Integer> price  = new ArrayList<>();
//        ArrayList<Integer> total  = new ArrayList<>();
//
//        String result;
//        String product = " ";
//        int subTotal = 0;
//        double discounted = 0;
//        double vat = 17.50;
//        double vatEstimate = 0;
//        double totalPrice = 0;
//        double balance = 0;
//
//        System.out.print("Enter customers name: ");
//        String cutomerName = scanner.nextLine();
//        String responses = "yes";
//        while (responses.equals("yes")){
//            System.out.print("Enter the item purchased by the customer: ");
//            product = scanner.nextLine();
//            productName.add(product);
//            scanner.nextInt();
//
//            System.out.print("Enter item quantity");
//            int pieces = scanner.nextInt();
//            Quantity.add(pieces);
//
//            System.out.print("Enter item price per unit: ");
//            int amount = scanner.nextInt();
//            price.add(amount);
//            int purchasePrice = pieces * amount;
//
//            total.add(purchasePrice);
//            subTotal += purchasePrice;
//
//            scanner.nextLine();
//
//            System.out.print("Enter yes to continue chopping or no to stop: ");
//            responses = scanner.nextLine();
//
//        }
//        System.out.print("What is your name? ");
//        String cashierName = scanner.nextLine();
//
//        System.out.println("How much discount will the cudtomer get? ");
//        int discount = scanner.nextInt();
//        discounted = subTotal * ((double) discount / 100);
//        vatEstimate = subTotal * (vat / 100);
//        totalPrice = (subTotal + vatEstimate) - discounted;
//
//        int length = productName.size();
//
//        System.out.println("""
//                SEMICOLON STORES
//                LOCATION:  312, HERBERT MACAULAY WAY,SAO YABA, LAGOS.
//                TEL: 03293828343
//                Date: 18-Dec-22 8:48:11 pm
//                cashier: cashier's Name
//                Customer Name:Chukwuma Adekunle Ciroma
//                ======================================================
//                         ITEM        QTY      PRICE          TOTAL(NGN)
//                ------------------------------------------------------
//                         Parfait      2       2100.00         4200.00
//                         Rice         2       550.00          1100.00
//
//                ------------------------------------------------------
//                                    Sub Total:                5300.00
//                                    Discount:                 424.00
//                                    VAT @ 17.50%              927.50
//                =====================================================
//                                    Bill Total:              5803.50
//                =====================================================
//                THIS IS NOT A RECEIPT, KINDLY PAY 5803.50
//                =====================================================""");
//
//    }
//}
