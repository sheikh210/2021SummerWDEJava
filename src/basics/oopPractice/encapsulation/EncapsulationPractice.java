package basics.oopPractice.encapsulation;

import basics.oopPractice.encapsulation.LearnEncapsulation;

public class EncapsulationPractice {

    public static void main(String[] args) {
        LearnEncapsulation obj = new LearnEncapsulation();

        double accountBalance = obj.getAccountBalance();

        System.out.println("The account balance is " + accountBalance);
    }

}
