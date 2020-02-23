package day32_custommethods;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayMessage("Java is fun!");
        displayMessage("Coding Java today");
        greetByName("Sabri");
        greetByName("Sulla");
    }
    public static void displayMessage(String message){

        System.out.println("message: "+message);
    }
    public static void greetByName (String name){
        System.out.println("Hello, "+name+", how are you?");
        System.out.println("Where have you been "+name+"?");
    }
}
/*OUTPUT
        message: Java is fun!
        message: Coding Java today
        Hello, Sabri, how are you?
        Where have you been Sabri?
        Hello, Sulla, how are you?
        Where have you been Sulla?*/