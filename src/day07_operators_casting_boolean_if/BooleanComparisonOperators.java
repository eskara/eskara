package day07_operators_casting_boolean_if;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10>5);
        System.out.println(23<=18);
        System.out.println(7==7);
        System.out.println(10>=10);
        System.out.println(35!=47);
        System.out.println(6!=6);

        int num1=100;
        int num2 = 200;
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1!=num2);

        boolean b1 = 123>100;
        System.out.println("b1: "+b1);
        int currentSpeed = 50;
        int speedLimit = 55;
        boolean overLimit =currentSpeed>speedLimit;
        System.out.println("overLimit: "+overLimit);

    }
}
