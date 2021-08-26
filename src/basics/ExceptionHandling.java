package basics;

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] array1 = {4, 8, 12, 16};
        int[] array2 = {2, 0, 6, 8};

        int length = array1.length;
        int maxIndex = length - 1;

        for (int i = 0; i < length; i++) {
            try {
                fourthMethod(array1, array2, i, i);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void fourthMethod(int[] array1, int[] array2, int firstIndex, int secondIndex) {
        thirdMethod(array1, array2, firstIndex, secondIndex);
    }

    public static void thirdMethod(int[] array1, int[] array2, int firstIndex, int secondIndex){
        printQuotient(array1, array2, firstIndex, secondIndex);
    }

    public static void printQuotient(int[] array1, int[] array2, int firstIndex, int secondIndex) {
        System.out.println(array1[firstIndex] / array2[secondIndex]);
    }

}
