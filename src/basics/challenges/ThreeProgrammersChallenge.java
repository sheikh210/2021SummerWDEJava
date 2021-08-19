package basics.challenges;

public class ThreeProgrammersChallenge {

    /*
    Create a function that accepts 3 numbers (the hourly wages of 3 programmers) and returns the difference between the
    highest hourly wage and the lowest hourly wage

    NOTE: DON'T FORGET TO RETURN THE RESULT
     */

    public static void main(String[] args) {
        System.out.println(getDifferenceInWage(100, 200, 100));
    }

    public static int getDifferenceInWage(int wage1, int wage2, int wage3) {
        int largestWage = 0;
        int smallestWage = 0;

        if (wage1 > wage2 && wage1 > wage3 && (wage2 != wage3)) {
            largestWage = wage1;
        } else if (wage2 > wage1 && wage2 > wage3 && (wage1 != wage3)) {
            largestWage = wage2;
        } else if (wage3 > wage1 && wage3 > wage2 && (wage1 != wage2)) {
            largestWage = wage3;
        }

        if (wage1 < wage2 && wage1 < wage3 && (wage2 != wage3)) {
            smallestWage = wage1;
        } else if (wage2 < wage1 && wage2 < wage3 && (wage1 != wage3)) {
            smallestWage = wage2;
        } else if (wage3 < wage1 && wage3 < wage2 && (wage1 != wage2)) {
            smallestWage = wage3;
        }

        return largestWage - smallestWage;
    }

}
