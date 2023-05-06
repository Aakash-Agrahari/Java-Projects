package com.company;

class bankk{
    public void interestReceived(int money){

    }
}

class hdfc extends bankk{
    @Override
    public void interestReceived(int money) {
       double interest = 5.7;
       double roi = (interest/100)*money;
        System.out.println(roi);
    }
}

class icici extends bankk{
    @Override
    public void interestReceived(int money) {
        double interest = 6.2;
        double roi = (interest/100)*money;
        System.out.println(roi);
    }
}

public class banking {
    public static void main(String[] args) {
        // to run both classes with same object name.
        /*bankk b1;
        b1 = new hdfc();
        b1.interestReceived(34545);
        b1 = new icici();
        b1.interestReceived(53753);*/

        // to run both classes with other object name.
        bankk b1 = new hdfc();
        b1.interestReceived(32423);
        bankk c1 = new icici();
        c1.interestReceived(89433);
    }
}
