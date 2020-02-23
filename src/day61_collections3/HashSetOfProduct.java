package day61_collections3;
import java.util.*;
import day60_collections2.Product;
public class HashSetOfProduct {
    public static void main(String[] args) {
        Set<Product>profSet=new HashSet<>();
        profSet.add(new Product("book", 25));
        profSet.add(new Product("book", 25));
        profSet.add(new Product("magazine", 17));

        System.out.println(profSet.size());
        System.out.println(profSet.toString());

    }
}
