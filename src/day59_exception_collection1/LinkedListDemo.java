package day59_exception_collection1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        List<String>linkedList2=new LinkedList<>();

        linkedList.add("java");
        linkedList.add("phyton");
        linkedList.add("c#");
        linkedList.add("C++");
        linkedList.addFirst("html");
        linkedList.addFirst("javascript");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.toString());

        for(String each: linkedList){
            System.out.println("each = "+each);
        }

    }
}
