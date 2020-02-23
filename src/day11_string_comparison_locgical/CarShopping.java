package day11_string_comparison_locgical;

import java.util.Scanner;

public class CarShopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("Welcome to our Car Dealership!");
       System.out.println("Enter model");
        String carModel=scan.nextLine();
        System.out.println("Enter price");
        double carPrice=scan.nextDouble();
        double budget=35000;
        if (carModel.equalsIgnoreCase("toyota")||carModel.equalsIgnoreCase("bmw")||carModel.equalsIgnoreCase("nissan")||carModel.equalsIgnoreCase("tesla")&&carPrice<=budget){
            System.out.println("I like this car model");}else{
            System.out.println("I dont like this car model");
        }
    }
}
