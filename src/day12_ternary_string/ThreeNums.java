package day12_ternary_string;

import java.util.Scanner;

public class ThreeNums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int num1=scan.nextInt();
        int num2=scan.nextInt();
                int num3=scan.nextInt();
                if (num1>=num2 && num1>=num3){
                    System.out.println(num1+" is largest");}else if(num2>=num1&&num2>=num3){
                    System.out.println(num2+" is largest");}else if(num3>=num1&&num3>=num2){
                    System.out.println(num3+" is largest");
                }
    }
}
