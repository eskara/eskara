package day42_encapsulation;
//1. class
import java.util.ArrayList;

public class NullValue {
    String inStr;//inStr = null; <- by default
    int numberOfDays;//0
    ArrayList<Integer> myList;//null
    public static void main(String[] args) {
       //Local value
        int n;
        String localStr;//does not get any default value like null
        //System.out.println(n);
       // System.out.println(localStr);//<--ERROR. Not initialized
        String myString=null;
        Integer num=null;
        System.out.println(num.toString());
        System.out.println(myString);//null
        System.out.println(myString.length());

    }
    int numberOfFloor;
    public void rent(){
        //local variables.They do not get any default
        double price;
        int floorNumber;
        String resident;
        //floorNumber++;ERROR - not initialized
       //numberOfFloor;//1

}
}
