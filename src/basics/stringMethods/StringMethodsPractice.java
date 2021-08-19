package basics.stringMethods;

public class StringMethodsPractice {

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("Mom");
        System.out.println(isPalindrome);
    }

    public static char[] reverseString(String text) {

        char[] textArray = text.toLowerCase().toCharArray();
        int length = textArray.length;
        char[] reversedArray = new char[length];

        for(int i = length - 1; i >= 0; i--) {
            reversedArray[(length-1) - i] = textArray[i];
        }

        return reversedArray;
    }

    public static boolean isPalindrome(String word) {
        char[] normalArray = word.toLowerCase().toCharArray();
        char[] reversedArray = reverseString(word);

        int length = normalArray.length;

        for (int i = 0; i < length; i++) {
            if (normalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

}
