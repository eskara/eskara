package day12_ternary_string;

import java.util.Scanner;

public class CapitalCity {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the capitol of Turkey?");
        String capital=scan.nextLine();

        if (capital.equalsIgnoreCase("ankara")){
            System.out.println("Your answer is correct");}else{
            System.out.println("Your answer is false");
        }
    }
}
