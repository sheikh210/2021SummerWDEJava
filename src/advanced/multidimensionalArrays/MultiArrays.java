package advanced.multidimensionalArrays;

public class MultiArrays {

    public static void main(String[] args) {

        int[][] myArray = new int[3][5];

        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[0][3] = 4;
        myArray[0][4] = 5;

        myArray[1][0] = 10;
        myArray[1][1] = 20;
        myArray[1][2] = 30;
        myArray[1][3] = 40;
        myArray[1][4] = 50;

        myArray[2][0] = 100;
        myArray[2][1] = 200;
        myArray[2][2] = 300;
        myArray[2][3] = 400;
        myArray[2][4] = 500;

        for (int i = 0; i<3; i++) {
            for (int j = 0; j<5; j++) {
                System.out.println(myArray[i][j]);
            }
            System.out.println("**************");
        }
    }

}
