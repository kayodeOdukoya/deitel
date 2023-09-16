package assignment;

import java.util.Scanner;

public class School1Test {

    public static void main(String[] args) {

        School1 mySchool = new School1();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter School name: ");
        String schoolName = input.nextLine();
        mySchool.setSchoolName(schoolName);

        System.out.print("Enter school location: ");
        String schoolLocation = input.nextLine();
        mySchool.setLocation(schoolLocation);

        System.out.print("Enter number od Student: ");
        int numberOfStudent = input.nextInt();
        mySchool.setNumberOfStudent(numberOfStudent);

        System.out.printf("school Name is: %s%n", mySchool.getSchoolName());
        System.out.printf("the school location is: %s%n", mySchool.getLocation());
        System.out.printf("the number of students are: %d%n", mySchool.getNumberOfStudent());



    }


}

