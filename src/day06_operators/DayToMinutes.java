package day06_operators;
import java.util.Scanner;
public class DayToMinutes {
    public static void main(String[] args){
        System.out.println("Enter number of days:");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int minute = day*1440;
        System.out.println(day +" day is "+minute+" minutes");
    }
}
