package day50_inheritance_hiding;
import java.util.*;
public class Shop {
    String name;
     List<Product>products=new ArrayList<>();
     public String toString(){
         return "name = "+name+", products = "+products;
     }
}
class ShopObjects{
    public static void main(String[] args) {
        Shop shop=new Shop();
        shop.name="CVS";


    }
}