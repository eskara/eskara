package day06_operators;
import java.util.Scanner;
public class tempConventor {
    public static void main(String[] args){
        System.out.println("Enter Fahrenheit value");
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
                double celsius =(fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit+" is "+celsius+"celcius");
        System.out.println("####### C to F CONVENTER ######");

        //Formula = (C * 9/5)+32
        System.out.println("Enter celcius value");
        celsius = input.nextDouble();
        fahrenheit = (celsius*9/5)+32;
        System.out.println(celsius+"is"+fahrenheit+"fahrenheit");



    }
}
