package day48_overriding;

public class Horse extends Animal{

    public void speak(){
        System.out.println("Horse is saying hihihi");

    }
    public void move(){
        System.out.println("Horse is running fast");
    }
    public void eat(String str){
        System.out.println("Horse is eating "+str+"...");

}}
