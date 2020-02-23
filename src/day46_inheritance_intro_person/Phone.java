package day46_inheritance_intro_person;

public class Phone extends Device {
   public String carrier;
    public void call(){
        System.out.println("Calling from "+ brand +" phone using "+ carrier);
    }
    public void text(String message){
        System.out.println("Texting from "+ brand +" phone using "+ carrier);
        System.out.println("message: "+message);
    }}