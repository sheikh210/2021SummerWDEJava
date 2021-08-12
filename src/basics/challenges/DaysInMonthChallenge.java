package basics.challenges;

public class DaysInMonthChallenge {

    /*
    Create a method that returns the number of days in a month, with the name of the month + the year, passed as arguments to the method
         STEPS
            1 - Write a method getDaysInMonth() which accepts 2 parameters of type int, called month and year
            2 - If the argument for month that is passed to the method is <1 or >12, return -1
            3 - If the argument for year that is passed to the method is <1 or >9999, then return -1
            4 - This method needs to return the number of days in a month
            ***BE CAREFUL ABOUT LEAP YEARS (29 days in month 2)
                Examples:
                getDaysInMonth(1, 2020) - Returns 31, since Jan has 31 days
                getDaysInMonth(2, 2020) - Returns 29
                getDaysInMonth(2, 2021) - Returns 28
                getDaysInMonth(-7, 2026) - Returns -1, since month parameter is invalid
                getDaysInMonth(2, -2020) - Returns -1, since parameter year is outside of range (1-9999)

            5 - Write a method isLeapYear() with a parameter of type int named year
            6 - The argument needs to be greater than or equal to 1 AND less than or equal to 9999.
                If the argument is not in that range, return false
            7 - Otherwise, if it’s in the valid range, calculate if year is a leap year, and return true if it is

                HINT: A year is a leap year if it is divisible by 4, but not by 100 OR if it is divisible by 400
                Examples:
                isLeapYear(-1600) - Returns false, since the argument is not within the range
                isLeapYear(1600) - Returns true
                isLeapYear(2022) - Returns false, since 2022 is not a leap year
                isLeapYear(2020) - Returns true

     */

    public static void main(String[] args) {
        String month = "February";
        int monthNum = getMonthNumberUsingStringNameOfMonth(month);
        int year = 2023;

        int numOfDaysInMonth = getDaysInMonth(monthNum, year);

        System.out.println(numOfDaysInMonth);
    }

    public static int getDaysInMonth(int month, int year) {

        int numOfDays = -1;

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            System.out.println("HEY! ENTER GOOD DATA! YOU NUMBSKULL!");
            return numOfDays;
        }

        boolean flag = isLeapYear(year);

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 2:
                if (flag) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                numOfDays = 30;
                break;
            default:
                return numOfDays;
        }

        return numOfDays;
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if (year < 1 || year > 9999) {
            System.out.println("HEY! ENTER GOOD DATA! YOU NUMBSKULL!");
            return isLeapYear;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        return isLeapYear;
    }

    public static int getMonthNumberUsingStringNameOfMonth(String month){
        int monthNumber;

        switch (month) {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
        }

        return monthNumber;
    }





}
