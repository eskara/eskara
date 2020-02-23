package day32_custommethods;

public class AboutMe {
    public static void code(){
        System.out.println("I code java");
    }
    public static void main(String[] args) {
        myName();
        morning();
        code();

    }
    public static void myName(){
        System.out.println("My name is Bob");

    }
    public static void morning(){
        System.out.println("I am wake up at 7 am");
        System.out.println("I have my breakfast");
        System.out.println("Go to school");

    }
}
