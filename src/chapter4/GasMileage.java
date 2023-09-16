package chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

            while (true){

                System.out.print("Enter miles driven: ");
                double miles = scanner.nextDouble();

                System.out.print("Enter the gallons used: ");
                double gallons = scanner.nextDouble();

                System.out.print("Enter miles per gallon: ");
                double milesPerGallon  = scanner.nextDouble();

                double total = miles / gallons * (milesPerGallon);
                System.out.printf("the total miles driven is: %f%n:", total);

                System.out.println("""
                        Did you want to travel more miles?
                        press -> yes to continue
                        press -> Anything to quit
                 
                        """);
                String response = input1.nextLine();
                if(response.equals("no"))
                break;


            }

    }
}