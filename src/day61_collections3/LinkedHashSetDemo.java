package day61_collections3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>();

        set.add("java");
        set.add("java");
        set.add("selenium");
        set.add("html");
        set.add("sql");
        set.add("git");
        set.add("ruby");

        System.out.println("size: "+set.size());
        System.out.println(set.toString());
        set.remove("java");
        set.forEach(each -> System.out.println(each));//asagidakiyle ayni sey for each loop gibi
        for (String each: set){
            System.out.println(each);
        }

    }
}
