public class ExceptionHandling {

    public static void main(String[] args) {

        int result = 0;

        try {
            result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0 (1st catch)");
        }

        try {
            result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0 (2nd catch)");
            e.printStackTrace();
        }


    }

    public static int divide(int num1, int num2) {
        return num1/num2;
    }
}
