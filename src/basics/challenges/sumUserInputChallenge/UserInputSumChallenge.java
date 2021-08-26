package basics.challenges.sumUserInputChallenge;

import java.util.Scanner;

public class UserInputSumChallenge {

    /*
    CHALLENGE
        Write a program (method) that accepts user input as integers. The program should prompt/ask the user to
        enter 5 numbers, one at a time, then print out the sum of the 5 numbers entered by the user.
     */

    public static void main(String[] args) {
        sumInput();
        sumInput2();
    }

    /**
     * METHOD 2 - ONE OF THE MOST EFFICIENT WAYS TO ACCOMPLISH THIS TASK (THERE IS A MORE EFFICIENT WAY)
     * @author - Roly
     */

    public static void sumInput2() {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("PLEASE ENTER NUMBER " + i + " BELOW:");
            sum += input.nextInt();
        }

        input.close();
        System.out.println(sum);
    }

    /**
     * METHOD 1 - INCORRECT WAY TO DO THIS - NEVER DUPLICATE (COPY/PASTE) CODE THAT IS THE SAME,
     *            IN ORDER TO ACCOMPLISH A TASK
     * @author: Eddy
     */
    public static void sumInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER A NUMBER BELOW:");
        int num = input.nextInt();

        System.out.println("PLEASE ENTER A NUMBER BELOW:");
        int num1 = input.nextInt();

        System.out.println("PLEASE ENTER A NUMBER BELOW:");
        int num2 = input.nextInt();

        System.out.println("PLEASE ENTER A NUMBER BELOW:");
        int num3 = input.nextInt();

        System.out.println("PLEASE ENTER A NUMBER BELOW:");
        int num4 = input.nextInt();

        input.close();

        int sum = num + num1 + num2 + num3 + num4;

        System.out.println("SUM: " + sum);
    }


}
