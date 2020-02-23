package day42_encapsulation;
//3.class
public class People {
    public static void main(String[] args) {
        Person p1=new Person();
        //p1.name="Marufjon"; ERROR: name is private
        //p1.age=-22; ERROR: age is private
        System.out.println(p1.toString());
        p1.setName("Ersin");
        System.out.println(p1.getName());
        System.out.println(p1.toString());

        Person p2=new Person();
        p2.setName("Sarah");
        System.out.println(p2.getName());
        p2.setAge(-3);
        System.out.println(p2.getAge());
        p2.setAge(44);
        System.out.println("Sarah's age: "+p2.getAge());
        System.out.println(p2.toString());
    }
}
