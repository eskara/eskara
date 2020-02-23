package day55_polymorphism2;
import day09_multibranch_switch.Switch;
import day54_polymorphism.*;
import java.util.*;

public class ShapeManager {
    public static Shape buildShape(String type) {
        Shape retShape = null;
        switch (type.toLowerCase()) {
            case "shape":
                retShape = new Shape();
                break;
            case "triangle":
                retShape = new Triangle();
                break;
            case "diamond":
                retShape = new Diamond();
                break;
            case "square":
                retShape = new Square();
            break;
        }
        return retShape;
    }
    public static void drawSquare(Square squareObj){
        System.out.println("Drawing a square...");
        squareObj.draw();
    }
    public static void drawShape(Shape shapeObj){
        System.out.println("Drawing a shape - " + shapeObj+"...");
        shapeObj.draw();
    }
    public static void drawShape(List<Shape> shapeList){
        for(Shape each : shapeList) {
            System.out.println("Drawing a shape - " + each.type + "...");
            each.draw();
        }
    }
    public static void drawShapeFromObject(Object object) {
        System.out.println("Drawing shape from object...");
        System.out.println(object.getClass().getSimpleName());

        System.out.println("---- METHOD WITH SHAPE RETURN ---");
        buildShape("diamond").draw();
        Shape tr = buildShape("triangle");
        tr.draw();

    }}