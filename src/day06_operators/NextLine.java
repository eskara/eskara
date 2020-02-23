package day06_operators;
import java.util.Scanner;
public class NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is our full name?");
        String fullName = scan.nextLine();//next() kullanirsak tek kelime alacak.
        System.out.println(fullName+" is coding Java");
        System.out.println("Enter adress:");
        String adress = scan.nextLine();
        System.out.println(fullName+ " lives in "+adress);

    }
}
