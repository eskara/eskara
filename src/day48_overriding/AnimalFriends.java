package day48_overriding;

import javax.crypto.spec.PSource;

public class AnimalFriends {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.speak();
        animal.move();

        Cat cat=new Cat();
        cat.speak();
        cat.move();
        Animal horse =new Animal();
        horse.speak();
        horse.move();

        Horse horses=new Horse();

        horses.speak();
        horses.move();

        Wolf wolf=new Wolf();
        wolf.speak();
        wolf.move();
        animal.eat("apples");
        cat.eat("fish");
        horse.eat("Hay with carrots");
        wolf.eat("meat");
        horses.eat("Carrot");
        cat.eat("chicken");

    }
}