package day48_overriding;

public class Wolf extends Animal {
    public void speak() {
        System.out.println("Wolf saying wuuuuu");
    }

    public void move() {
        System.out.println("Wolf is moving hunting for food");
    }

    public void eat(String food) {
        System.out.println("Wolf is eating " + food + "...");
    }
}