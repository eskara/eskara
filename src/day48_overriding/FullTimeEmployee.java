package day48_overriding;

public class FullTimeEmployee extends Employee {
    public void calculatePay(int hours, double rate){
        System.out.println("Full time Employee total pay: "+(hours*rate*1.05));
    }
    public String toString(){
        System.out.println("Parents version: "+super.toString());
        return "FullTimeEmployee toString()";
    }
}
