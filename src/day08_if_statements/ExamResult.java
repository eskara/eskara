package day08_if_statements;
import java.util.Scanner;
public class ExamResult {
    public static void main(String[] args) {
        //60 is a passing score
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your note");
        int yourNote=scan.nextInt();
        if (yourNote>=60) {
            System.out.println("Congratulations, you passed the exam!");
        }else{
            System.out.println("You failed");
            System.out.println("Please study more and try again. Don't be sad");
        }
    }
}
