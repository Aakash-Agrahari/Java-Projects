package com.company;

class vehicle{
    public void run(){
        System.out.println("Vehicle is running....");
    }
}
class bike extends vehicle{
    //here we can use @Override which is an annotation in java which gives information to the compiler that here we
    //are going to do overriding. Actually, annotations are used for the same i.e. to make compiler to know we are
    //using the method so that it renders any error.
    public void run(){
        System.out.println("Bike is running....");
    }

    public void printMessage(){ //Creating this to show usage of super keyword,
        run();
        super.run();//using super keyword as there is method overriding
                    //super keyword is used as reference to the object of the superclass.
    }
}

public class override {
    public static void main(String[] args){
        bike b = new bike();
        b.printMessage();

    //We cannot use super keyword inside main class because here main class is static and can't be invoked(call) by
    //an object.
    }

}
