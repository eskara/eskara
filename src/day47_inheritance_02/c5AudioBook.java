package day47_inheritance_02;

public class c5AudioBook extends c4Book {
    private double length;
    private String narrator;
    //Listening to AudioBook written by Jackie Chan with title Java in Action.
    //Narrated by Maria
    public void listen(){
        System.out.println(getAuthor());
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String getNarrator() {
        return narrator;
    }
    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

}
