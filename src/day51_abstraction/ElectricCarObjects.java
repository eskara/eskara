package day51_abstraction;

public class ElectricCarObjects {
    public static void main(String[] args) {
        //c1ElectricCar ec = new c1ElectricCar(); //COMPILE ERROR: ELECTRICCAR, cannot be instantied
        Tesla modelS = new Tesla();
        modelS.charge();
        modelS.start();
        modelS.drive();
       // modelS.stop();//we did not add to tesla class, it is non-abstract method
        System.out.println();
        Ford fusion = new Ford();
        fusion.charge();
        fusion.start();
        fusion.drive();
        //fusion.stop();//we did not add to ford class, it is non-abstract method
    }
}
