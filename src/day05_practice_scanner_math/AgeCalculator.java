package day05_practice_scanner_math;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args){
        String name = "ersin";
        int yearOfBirth = 1997;
                int currentYear = 2019;
                        int age = currentYear - yearOfBirth ;
                        System.out.println( name +" is "+age+ " years old");
                        Scanner input = new Scanner(System.in);
                        System.out.println("How old are you");
                        String age1 = input.next();
                        System.out.println("You are "+ age1 + " years old");

    }
}
