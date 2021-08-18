package basics;

import java.util.Scanner;

public class Trying {

    static {
        scan = new Scanner(System.in);
    }

    static Scanner scan;

    public static void main(String[] args) {

        int input = 0;
        System.out.print("Enter a number | To exit, enter '-1' > ");

        while (true) {
            String garbageOutput = null;

            if (scan.hasNextInt() && ((input = scan.nextInt()) != -1)) {
                System.out.println("\nYou entered: " + input);
                System.out.print("Enter a number | To exit, enter '-1' > ");

            } else if (scan.hasNextInt() && (scan.nextInt() == -1)) {
                System.out.println("Goodbye");
                break;

            } else if (!scan.hasNextInt() && (scan.hasNextLine()) && (!(garbageOutput = scan.nextLine()).isEmpty())) {
                System.out.printf("You've entered garbage - [%s]%n", garbageOutput);
            }
        }

    }
}
