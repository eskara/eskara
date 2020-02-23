package day50_inheritance_hiding;
import java.util.*;
public class Burger {
    private String name;
private List<Ingredient> ingredients=new ArrayList<>();

    public Burger(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';

    }
}
