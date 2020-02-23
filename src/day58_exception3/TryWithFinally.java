package day58_exception3;

public class TryWithFinally {
    public static void main(String[] args) {
        //Dont try use it in real coding, where they pay you!!
        try {
            System.out.println("In Try Block...");
            System.out.println(9/0);
        }finally {
            System.out.println("In Finally block...");
        }
        System.out.println("After try finally...");
    }
}
