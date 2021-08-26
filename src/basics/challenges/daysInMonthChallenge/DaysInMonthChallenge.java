package basics.challenges.daysInMonthChallenge;

public class DaysInMonthChallenge {

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
