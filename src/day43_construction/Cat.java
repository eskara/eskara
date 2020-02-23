package day43_construction;

public class Cat {
    private String name;
    public Cat(){
        System.out.println("Cat constructor");
        name="unknown";//initialize variable
    }
    public String getName(){
        return name;
    } public Cat(String name){
        System.out.println("Cat constructor with name");
        this.name=name;

    }
}
