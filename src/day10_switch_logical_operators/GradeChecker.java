package day10_switch_logical_operators;

public class GradeChecker {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Fail");
            default:
                System.out.println("Unknown grade");
        }
    }
}
