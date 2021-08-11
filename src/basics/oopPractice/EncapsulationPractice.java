package basics.oopPractice;

public class EncapsulationPractice {

    public static void main(String[] args) {
        LearnEncapsulation obj = new LearnEncapsulation();

        double accountBalance = obj.getAccountBalance();

        System.out.println("The account balance is " + accountBalance);
    }

}
