package day37_arraylist;
import java.util.*;
public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String>shoppingList=new ArrayList<>();
        //check if list is empty
        System.out.println("isEmpty() - "+shoppingList.isEmpty());
        System.out.println("size () == 0 - "+(shoppingList.size()==0));
        if(shoppingList.isEmpty()) {
            System.out.println("List is empty, nothing to buy. keep coding java");
        }else{
            System.out.println("List is not empty. code java then go to mall");
        }
        shoppingList.add("Apple Laptop");
        shoppingList.add("Tesla");
        shoppingList.add("Sport Shoes");
        shoppingList.add("T-shirt");
        shoppingList.add("Jacket");
        shoppingList.add("Hat");
        shoppingList.add("Wooden Spoon");
        //check if list still empty. run if statement again
        if(shoppingList.isEmpty()) {
            System.out.println("List is empty, nothing to buy. keep coding java");
        }else{
            System.out.println("List is not empty. code java then go to mall");
        }
        //get count and assign into variable count>
        int count=shoppingList.size();
        System.out.println("Count of items to buy - "+count);
        //Check if 'jacket' is among the items
        System.out.println("list.contains(jacket) - "+shoppingList.contains("Jacket"));
        if(shoppingList.contains("Jacket")) {
            System.out.println(".Jacket on the list.Wear it then code java");
        }else{
            System.out.println("Jacket is not on list.keep coding java");
        }
        //find the index of tesla , apple laptop and hat.
        System.out.println(shoppingList.indexOf("Tesla"));
        System.out.println(shoppingList.indexOf("Apple Laptop"));
        System.out.println(shoppingList.indexOf("Hat"));
    }
}
