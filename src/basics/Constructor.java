package basics;

public class Constructor {

    public static void main(String[] args) {

        Operators ref = new Operators();

        int x = ref.addition();
        int y = ref.subtraction();
        int z = ref.division();
        int a = ref.multiplication();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}
