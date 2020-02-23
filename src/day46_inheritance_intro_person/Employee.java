package day46_inheritance_intro_person;

public class Employee extends Person{
    public String jobTitle;
    public void work(){
        System.out.println(name + " is working hard as  " + jobTitle);
    }
}
