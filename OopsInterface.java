package com.company;
                                               // we can't use constructors in an interface
/*interface bike{                              // interface is by default public so no need to write public
    void applyGear(int increment);              // In interface, we only need to declare methods not fields
    void applyBrake(int decrement);
}
class HondaBike implements bike {           // 'implements' keyword is used to attach an interface in a class.
    HondaBike(){                                         // Constructors can be used here
        System.out.println("Starting your Honda bike");
    }
    int speed = 11;

    public void applyGear(int increment) {                //applyGear(int increment) is method
        speed = speed + increment;                        //these all written here are 'fields'.
        System.out.println(this.speed);
    }

    public void applyBrake(int decrement) {  // now above value of speed comes here and again calculation is done
        speed = speed - decrement;
        System.out.println(this.speed);
    }
}
class PulsarBike implements bike{
    PulsarBike(){
        System.out.println("Now Starting your Pulsar bike");
    }
        int speed = 13;

        public void applyGear(int increment){
            speed = speed + increment;
            System.out.println(this.speed);
        }

        public void applyBrake(int decrement){
            speed = speed - decrement;
            System.out.println(this.speed);
        }
}

public class OopsInterface {
    public static void main(String[] args) {
        HondaBike B1 = new HondaBike();
        B1.applyGear(8);
        B1.applyBrake(6);

        PulsarBike P1 = new PulsarBike();
        P1.applyGear(11);
        P1.applyBrake(10);

    }
}
  */

