package com.company;
/*interface Sayable{
    public String say(String name);
}

public class lambdaExpressionModule {
    public static void main(String[] args) {

        //Lambda expression with single parameter.
        Sayable s1 = (name) -> {
            return "Hello, "+name;
        };
        System.out.println(s1.say("CSE Term-3 Techies"));

        //You can omit function parentheses.
        Sayable s2 = name-> "Hello, "+name;
        System.out.println(s2.say("Jain University"));
    };
}*/

interface Addable{
    int add(int a, int b);
}
public class lambdaExpressionModule{
    public static void main(String[] args){

        //Multiple parameters in lamda expression
        Addable a1 = (a,b)->(a+b);
        System.out.println(a1.add(10,20));

        //multiple parameters with data type implementation
        Addable a2 = (int a,int b)->(a+b);
        System.out.println(a2.add(100,200));
    }

}