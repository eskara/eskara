package day37_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();
        cities.add("McLean");
        cities.add("Alexandria");
        cities.add("Baltimore");
        cities.add("Baku");
        cities.add("Kabul");
        cities.add("Tashkent");
        cities.add("Tehran");
        cities.add("Asmara");
        cities.add(0, "Calamba");
        cities.add(1,"Reston");
        System.out.println(cities);

        cities.add(2,"Yerevan");
        System.out.println(cities);
        //CHANGE INDEX 4 TO NEW YORK
        cities.set(4,"New York");
        cities.set(5,"Samrkand");
        System.out.println(cities.toString());

        //remove element value at index 3
        cities.remove(3);
        System.out.println(cities.toString());
        cities.remove(3);
        cities.remove("Tashkent");
        System.out.println(cities);
        System.out.println();
    }
}
