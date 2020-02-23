package day52_interface;

public interface VoiceCallable {
    //public static final variables ONLY.
    public static final boolean CAN_CALL=true;
//Constructor
   // public VoiceCallable(); it will give error
    //abstract method
    public abstract void call(String contact);
    /*
     Only abstract methods before Java 8. Pure abstraction
     /AFTER JAVA 8 - static and default methods are added
     */
    //static method
    public static void decline(){
        System.out.println("Nadir declineed voice call...");
    }
    //default:
    public default void accept(){
        System.out.println("Nadir finally accepted voice call...");
    }
}
