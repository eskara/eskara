package day35_wrapper_classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cooking {
    public static void main(String[] args) {
       scrambledEggsRecipe();
        System.out.println();
        System.out.println("~~~  DELICIOUS PASTA RECIPE ~~~");
        add("water");
        boil(1);
        add("salt","spaghetti"," olive oil");
        boil(10);
        System.out.println("Pick up wooden spoon");
        mix(100);
        System.out.println("~~~ READY FOR SERVICE ~~~");

    }
    public static void scrambledEggsRecipe(){
        System.out.println("~~~  SCRAMBLED EGGS RECIPE ~~~");
        add("oil", "eggs", "salt","cheese", "milk");
        mix(30);
        fry(3);
        System.out.println("~~~  ENJOY YOUR SCRAMBLED EGGS ~~~");

    }
    public static void add(String... items){
        System.out.println("Add - "+ Arrays.toString(items));
    }public static void mix(int seconds){
        System.out.println("Mix for "+seconds+" seconds");

    }public static void boil(int minutes){
        System.out.println("Boil for "+minutes+ " minutes");

    }public static void fry(int minutes){
        System.out.println("Fry for "+minutes+" minutes");

    }public static void bake(int minute){
        System.out.println("Bake for "+minute+ " minutes");

    }
}
