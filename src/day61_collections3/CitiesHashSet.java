package day61_collections3;

import java.util.HashSet;
import java.util.Set;

public class CitiesHashSet {
    public static void main(String[] args) {
        Set<City> citySet=new HashSet<>();
       City c1=new City("Calamba");
        City c2=new City("Calamba");
        City c3=new City("Urumqi");
        City c4=new City("Qashgar");

        citySet.add(c1);
        citySet.add(c2);
        citySet.add(c3);
        citySet.add(c4);

        System.out.println(citySet.size());
        System.out.println(citySet.toString());

    }
}
