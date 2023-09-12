package chapter3;

import java.util.Scanner;

public class PetrolPurchaseDriver {
    public static void main(String[] args) {

        PetrolPurchase myStation = new PetrolPurchase("lagos","diesel", 1000,850, 550);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        myStation.setStationLocation(location);

        System.out.print("Enter petrol type: ");
        String petrolType = scanner.nextLine();
        myStation.setPetrolType(petrolType);

        System.out.print("Enter qty per liter: ");
        int quantity = scanner.nextInt();
        myStation.setQuantityPurchaseInLiters(quantity);

        System.out.print("Enter price per liter: ");
        int price = scanner.nextInt();
        myStation.setPercentageDiscount(price);

        System.out.print("Enter percentage discount: ");
        double discount = scanner.nextDouble();
        myStation.setPercentageDiscount(discount);

        System.out.printf("location is: %s%n", myStation.getStationLocation());
        System.out.printf("petrol type is: %s%n", myStation.getPetrolType());
        System.out.printf("quantity per liter is: %s%n", myStation.getQuantityPurchaseInLiters());
        System.out.printf("price per liter is: %s%n", myStation.getPercentageDiscount());
        System.out.printf("price per liter is: %s%n", myStation.getPercentageDiscount());
    }


    }

