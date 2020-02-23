package day48_overriding;

public class Employee extends Object {
    public void calculatePay(int hours, double rate){
        System.out.println("Employee total pay: "+(hours*rate));
    }
    @Override
public String toString(){

        return "Employee toString()";
}
}
