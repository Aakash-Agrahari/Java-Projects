package com.company;
//This is a Calculator that has features to do calculation and also feature to show errors if we do wrong input.

class InvalidInputException extends Exception{
    public void ErrorShowing(){ //We can also use here void and other.
        System.out.println("You can't enter 8 or 9.");  //here must be return if we use String or int not required for void.
    }
}

class MaxInputException extends Exception{
    public String toString(){ //With 'toString' there must be 'String' beside it.
        return "You can't enter number greater than or equal to 1000000.";
    }
}

class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Can't be divisible if denominator is zero.";
    }
}

class MaxMultiplyInputException extends Exception{
    public String toString(){
        return "You can't enter number greater than or equal to 700000";
    }
}

class Calculator{
    double Addition(double a, double b) throws InvalidInputException, MaxInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        if (a>=1000000 || b>=1000000){
            throw new MaxInputException();
        }
        return a+b;
    }
    double Subtraction(double a, double b) throws MaxInputException{
        if(a>=1000000 || b>=1000000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double Multiplication(double a, double b) throws MaxInputException, MaxMultiplyInputException{
       if (a>=1000000 || b>=1000000){
           throw new MaxInputException();
       }
       if(a>=700000 || b>=700000){
           throw new MaxMultiplyInputException();
       }
       return a*b;
    }
    double Division(double a, double b) throws MaxInputException, CannotDivideByZeroException{
        if(a>=1000000 || b>=1000000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}



public class Java_Calculator {
    public static void main(String[] args) throws InvalidInputException, MaxInputException,MaxMultiplyInputException, CannotDivideByZeroException  {
                Calculator C1 = new Calculator();
                System.out.println(C1.Addition(757,74398389));
                //System.out.println(C1.Subtraction(11178998,23778989));
                //System.out.println(C1.Multiplication(700000,100));
                //System.out.println(C1.Division(32,0));
    }
}





