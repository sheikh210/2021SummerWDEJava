package basics.dataStructures;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] nums = new int[7];

        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 25;
        nums[5] = 30;
        nums[6] = 35;

        IntroToDataStructure obj1 = new IntroToDataStructure();
        IntroToDataStructure obj2 = new IntroToDataStructure();
        IntroToDataStructure obj3 = new IntroToDataStructure();
        IntroToDataStructure obj4 = new IntroToDataStructure();
        IntroToDataStructure obj5 = new IntroToDataStructure();

        IntroToDataStructure[] objArray = new IntroToDataStructure[5];
        objArray[0] = obj1;
        objArray[1] = obj2;
        objArray[2] = obj3;
        objArray[3] = obj4;
        objArray[4] = obj5;
    }
}
