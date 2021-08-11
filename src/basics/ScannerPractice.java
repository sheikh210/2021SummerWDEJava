package basics;

import java.util.Scanner;

public class ScannerPractice {

    /*
     Group Exercise:
        Write a program (method) to accept user input, prompting user for their first name and then their last name,
        and then return their full name
     */

    public static void main(String[] args) {
        String fullName = getFullName();
        System.out.println(fullName);
    }

    public static String getFullName(){
        String fullName = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        fullName = firstName + " " + lastName;

        return fullName;
    }

}
