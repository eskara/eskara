package day61_collections3;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
       //Key , Value
        Map<String, Double>map=new HashMap<>();
        map.put("eggs", 4.45);
        map.put("strawberries", 7.99);
        map.put("potatoes", 7.0);
        map.put("cat food", 18.0);
        map.put("milk", 3.99);
        map.put("cookies", 3.49);
        map.put("cookies", 3.49);

        System.out.println(map.toString());
        System.out.println("size = "+map.size());

        System.out.println("Price of eggs: "+map.get("eggs"));
        System.out.println(map.get("strawberries"));
        System.out.println(map.get("potatoes"));
        System.out.println(map.get("cat food"));
        System.out.println(map.get("milk"));
        System.out.println(map.get("cookies"));

        System.out.println(map.keySet());//all keys in Set format
        System.out.println(map.values());//all values in Collection Format

        for (String key: map.keySet()) {
            System.out.print("key = "+key);
            System.out.println(", value = "+map.get(key));

        }
        System.out.println(map.containsKey("eggs"));

    }
}
