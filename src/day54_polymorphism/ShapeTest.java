package day54_polymorphism;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape=new Diamond();
        Square square=new Square();
        Triangle triangle=new Triangle();
        Diamond diamond=new Diamond();

        shape.draw();
        square.draw();
        triangle.draw();
        diamond.draw();

        //Polymorphism
        System.out.println("---- Polymorphism ----");
        Shape shape1=new Square();
        shape1.draw();
        shape1 = new Triangle();
        shape1.draw();

        shape1=new Diamond();
        shape1.draw();
        System.out.println("--- CALL DRAW WITHOUT ALL VARIABLE ---");
        new Triangle().draw();
        new Diamond().draw();
        new Square().draw();

        System.out.println("java".toUpperCase());

        //===========create 4 shapes, using polymorphism
        Object sahpeobj=new Shape();
        Shape square1=new Square();
        Shape triangle1=new Triangle();
        Shape diamond1=new Diamond();

       // Diamond dm=new Shape(); ERROR shape parent class oldugu icin hata verir
       //cannot put child reference to parent type class

        //square1.squareMethod();
        //DOWNCASTING: cast reference type to object type
        //DOWNCASTING: cast reference from parent type to child type
        //Shape square1 = new Square();
        //after casting as if: Square square1 = new Square();
        ((Square)square1).squareMethod();
        square.squareMethod();


    }
}
