package day50_inheritance_hiding;

import java.util.ArrayList;
import java.util.List;

public class Burger7 {
    public static void main(String[] args) {
        List<Ingredient>ingredient=new ArrayList<>();
        ingredient.add(new Ingredient("onion rings", 7));
        ingredient.add(new Ingredient("american cheese", 120));
        ingredient.add(new Ingredient("pickles", 10));
        ingredient.add(new Ingredient("lettuce", 5));
        ingredient.add(new Ingredient("b7 sauce", 200));

        Burger b7Burger=new Burger("COWBOY",ingredient);
        System.out.println(b7Burger.getIngredients().toString());
        System.out.println(b7Burger.toString());
    }
}
