package basics;

public class Parameters {

    // Parameters = Placeholders at the time of method declaration
    // Arguments = Values that are passed in to methods when the method is called

    public static void main(String[] args) {
        int x = subtraction(9, 5, "We are subtracting integers");

        System.out.println(x);
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y, String message) {
        System.out.println(message);

        return x - y;
    }

}
