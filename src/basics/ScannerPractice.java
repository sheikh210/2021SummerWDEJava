package basics;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER 1st NUMBER:");
        int x = sc.nextInt();

        System.out.println("PLEASE ENTER 2nd NUMBER:");
        int y = sc.nextInt();

        int z = x + y;

        System.out.println("YOUR SUM IS: " + z);
    }

}
