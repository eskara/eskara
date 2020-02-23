package day60_collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingCollection {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("java"); list.add("js"); list.add("html");
        list.add("ruby"); list.add("phyton"); list.add("kotlin");
        for(String str : list){
            System.out.println(str);
            //list.remove(str); - CurrentModificationException
            //list.remove(0); - CurrentModificationException
            //list.add("C#"); - CurrentModificationException
        }
        //Iterator interface can be used to iterator
        //Declaring Iterator variable and assigning our list

        Iterator<String>it =list.iterator();

        //System.out.println(it.hasNext());//true
        //System.out.println(it.next());//point to value
       // System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.next());//print current value and go to next
            it.remove();//remove the current value
        }
        System.out.println(list.toString());

    }
}
