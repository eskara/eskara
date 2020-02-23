package day11_string_comparison_locgical;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("Enter month:");
        int month=scan.nextInt();
        if (month>=3 &&month<=5){
            System.out.println("It is Spring");}else if(month>=6 && month<=8){
            System.out.println("It is Summer");}else if(month>=9&&month<=11){
            System.out.println("It is Fall");}else if(month==12||month==1||month==2){

            System.out.println("It is Winter");}else{
            System.out.println("Invalid month");
        }
    }
}
