package day56_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Before try catch: ");
        try {
            System.out.println("In try block");
    int result = 10 / 0;
            System.out.println("After 10/0 line");
        }catch (ArithmeticException e){}
        System.out.println("Exception happened and was caught and handled!");
System.out.println("After try catch");
    }
}
