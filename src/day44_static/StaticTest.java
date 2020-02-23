package day44_static;

import day43_construction.Cat;

public class StaticTest {
    public static void main(String[] args) {
        StaticVariable obj=new StaticVariable();
        System.out.println(obj.name);

        System.out.println(StaticVariable.userName);
        System.out.println(StaticVariable.age);
        System.out.println(StaticVariable.price);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        //System.out.println(Calculator.plus(4,6));
        Calculator calc=new Calculator();
        System.out.println(calc.plus(7, 6));//plus is instance method
        System.out.println(Calculator.minus(90, 35));//minus is static method
        int result=Calculator.divide(35,7);
        System.out.println("result: "+result);
        System.out.println(Math.abs(11));
        System.out.println(Math.abs(-8));

        System.out.println(Math.max(100, 500));
        System.out.println(Math.cos(45));
        System.out.println(Math.round(85.66));
       // Math m=new Math(); =>does not work

    }
}
