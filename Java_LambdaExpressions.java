package com.company;
            //This is the program to show Lambda Expressions.
@FunctionalInterface
interface XYZ{
    void meth1(int a); // We can also pass here any integer too.
}

public class Java_LambdaExpressions {
    public static void main(String[] args) {
        XYZ obj = (a)->{
            System.out.println("I am method 1 and is using lambda expressions.\t"+a );
        };
        obj.meth1(7);
    }
}
