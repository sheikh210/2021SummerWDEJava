package basics.controlFlow;

public class Conditionals {

    /*
     Control Flow - Code that can control the flow of a program, based on certain conditions
        Conditionals - Check whether an expression is true or false before executing or not executing certain
                       blocks of code
     */

    public static void main(String[] args) {
        switchCaseConditional();
    }

    public static void switchCaseConditional() {
        String nameOfMonth = getNameOfMonth(2);

        System.out.println(nameOfMonth);
    }

    public static String getNameOfMonth(int numOfMonth){
        String month;

        switch (numOfMonth) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Not a valid month";
        }

        return month;
    }


    public static void ifConditional() {
        int a = 500;
        int b = 499;
        int c = 500;
        int d = 974;

        if (a > c) {
            System.out.println("A is greater than C");
        } else if (b > d) {
            System.out.println("B is greater than D");
        } else if (a < d) {
            System.out.println("A is less than D");
        } else {
            System.out.println("None of the conditions were met");
        }

        /*
         We start the conditional using: if (condition) { }
         For multiple conditions we use: else if (condition) { }
         If no condition is met, and we would still like to execute some code, we use: else { }
         */
    }


}
