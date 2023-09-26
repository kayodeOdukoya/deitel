package personal;
import java.util.Scanner;

public class RadiusOfACircle {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double radius = scanner.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);




    }
}
