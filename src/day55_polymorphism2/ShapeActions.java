package day55_polymorphism2;

import day54_polymorphism.Diamond;
import day54_polymorphism.Shape;
import day54_polymorphism.Square;
import day54_polymorphism.Triangle;
import java.util.*;
import java.util.Random;

public class ShapeActions {
    public static void main(String[] args) {
        Square mySquare = new Square();
        ShapeManager.drawSquare(mySquare);//needs square object
        ShapeManager.drawSquare(new Square());
        //polymorhicly declare and assing 4 objects
        Shape myShape = new Shape();
        Shape myDiamond = new Diamond();
        Shape myTriangle = new Triangle();
        Shape yourSquare = new Square();
        ShapeManager.drawShape(myShape);//options: object of Shape, Square, Triangle, Diamond
        ShapeManager.drawShape(myDiamond);
        ShapeManager.drawShape(myTriangle);
        ShapeManager.drawShape(yourSquare);
        ShapeManager.drawShape(new Shape());//options: object of Shape, Square, Triangle, Diamond
        ShapeManager.drawShape(new Diamond());
        ShapeManager.drawShape(new Triangle());
        ShapeManager.drawShape(new Square());
        System.out.println("----- OBJECT PARAMETER ----");
        ShapeManager.drawShapeFromObject("java");
        ShapeManager.drawShapeFromObject(123);
        ShapeManager.drawShapeFromObject(true);
        ShapeManager.drawShapeFromObject('a');
        ShapeManager.drawShapeFromObject(myShape);
        Object object = new Random();
        System.out.println(object.toString());

        //cast to Random and call nextInt
        int num = ((Random)object).nextInt(11);
        System.out.println("num = " + num);
        //Downcast from Object to Random and assign to variable
        Random rand = (Random)object;
        System.out.println(rand.nextInt(5));
        System.out.println("----- METHOD WITH LIST<SHAPE> ---");
        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Shape());
        myList.add(new Diamond());myList.add(new Diamond());
        myList.add(new Square());myList.add(new Square());
        myList.add(new Triangle());myList.add(new Triangle());

        ShapeManager.drawShape(myList);


    }
}
