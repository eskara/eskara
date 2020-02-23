package day11_string_comparison_locgical;

import java.util.Scanner;

public class AmazonShopping {
    public static void main(String[] args) {
       System.out.println("Welcome to Amazon Shopping!");
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you a prime member?");
        boolean isPrimeMember=scan.nextBoolean();
        System.out.println("Enter your total price:");
        double totalOrderPrice=scan.nextDouble();
        if(isPrimeMember || totalOrderPrice>=25.0){
            System.out.println("Your order is eligible for free shipping");}else{
            System.out.println("Your order is not eligible for free shipping");
        }

    }
}
